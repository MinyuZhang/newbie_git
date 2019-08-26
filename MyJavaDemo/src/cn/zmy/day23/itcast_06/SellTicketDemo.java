package cn.zmy.day23.itcast_06;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		Thread t1 = new Thread(st, "甲");
		Thread t2 = new Thread(st, "乙");
		Thread t3 = new Thread(st, "丙");
		Thread t4 = new Thread(st, "丁");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
