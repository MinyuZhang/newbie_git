package cn.zmy.day24.Thread.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
	private int tickets = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while(true) {
			lock.lock();// 打开锁
			if (tickets > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();// release the resource
				}
				System.out.println(Thread.currentThread().getName() + ": tickets " + tickets + " was on sale.");
			} else {
				System.out.println("tickets have been sold out");
				System.out.println("Looking forward to your next visit.");
				System.exit(0);
//				break;
			}
			tickets --;
		}
	}
	
}