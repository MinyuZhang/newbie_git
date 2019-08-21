package cn.zmy.day24.Thread.itcast_01;
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();

		Thread t1 = new Thread(st, "甲");
		Thread t2 = new Thread(st, "乙");
		Thread t3 = new Thread(st, "丙");

		t1.start();
		t2.start();
		t3.start();
	}
}
