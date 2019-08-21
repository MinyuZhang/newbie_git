package cn.zmy.day24.Thread.itcast_06;

public class Test implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <100; i ++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

}
