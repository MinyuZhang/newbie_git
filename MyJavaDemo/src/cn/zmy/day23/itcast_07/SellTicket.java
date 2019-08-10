package cn.zmy.day23.itcast_07;

public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在出售第"
						+ (tickets--) + "张票");
			} else {
				System.out.println("票已经卖完了");
				break;
			}
		}
	}
}
