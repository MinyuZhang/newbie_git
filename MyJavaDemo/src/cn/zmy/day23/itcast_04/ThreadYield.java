package cn.zmy.day23.itcast_04;

public class ThreadYield extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i ++) {
			System.out.println(getName() + "<>" + i);
			Thread.yield();
		}
	}

}
