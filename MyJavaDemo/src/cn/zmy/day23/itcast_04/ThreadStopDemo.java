package cn.zmy.day23.itcast_04;

/*
 * public final void stop():让线程停止，过时了，但是还可以使用。
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();

		try {
			Thread.sleep(3000);
//			ts.stop();
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
