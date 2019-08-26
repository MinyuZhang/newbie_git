package cn.zmy.day23.itcast_07;

/*
 * ʵ��Runnable�ӿڵķ�ʽʵ��
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();

		Thread t1 = new Thread(st, "晴天");
		Thread t2 = new Thread(st, "雨天");
		Thread t3 = new Thread(st, "雪天");

		t1.start();
		t2.start();
		t3.start();
	}
}