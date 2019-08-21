package cn.zmy.day24.Thread.itcast_12;

import java.util.Timer;

/*
 * 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer:定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:任务
 */
public class TimerDemo {
	public static void main(String[] args) {
		// 创建定时对象
		Timer t = new Timer();
		// 创建任务对象
		MyTimeTask mtt = new MyTimeTask(t);
		// 3秒之后执行任务
		t.schedule(mtt, 3000);
	}
}
