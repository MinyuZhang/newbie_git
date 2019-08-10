package cn.zmy.day23.itcast_05;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			// 由于实现接口的方式就不能直接使用Thread类的方法了,但是可以间接的使用
			System.out.println(Thread.currentThread().getName() + ":" + x);
			Thread.yield();// 暂停当前正在执行的线程对象，并执行其他线程。 
		}
	}

}