package cn.zmy.day23.itcast_04;

public class ThreadSleep extends Thread {

	@Override
	public void run() {
		try {
			System.out.println(getName() + " wait one second");
			Thread.sleep(1000);
			System.out.println(getName() + "By reading we enrich the mind, by conerversation we polish it.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
