package cn.zmy.day23.itcast_06;

public class SellTicket extends Thread {
	private static int ticket = 100;
	@Override
	public void run() {
		while(true) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
				ticket --;
			} else {
				System.out.println(Thread.currentThread().getName() + "tickets have been sold out");
				break;
			}
		}
	}
}
