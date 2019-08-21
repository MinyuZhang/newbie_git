package cn.zmy.day24.Thread.itcast_12;

import java.util.Timer;

public class TimerDemo2 {
	public static void main(String[] args) {
		// 创建定时对象
		Timer t = new Timer();
		MyTimeTask2 mtt2 = new MyTimeTask2();
		t.schedule(mtt2, 3000, 1000);
	}
}
