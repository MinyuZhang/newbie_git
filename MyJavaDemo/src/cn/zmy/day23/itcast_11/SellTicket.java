package cn.zmy.day23.itcast_11;

public class SellTicket implements Runnable {

	// 定义100张票
	private static int tickets = 100;

	// 定义同一把锁
	private Object obj = new Object();
	private Demo d = new Demo();

	private int x = 0;

	// 同步代码块用obj做锁
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (obj) {
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "正在出售第" + (tickets--) + "张票 ");
//				}
//			}
//		}
//	}

	// 同步代码块用任意对象做锁
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (d) {
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "正在出售第" + (tickets--) + "张票 ");
//				}
//			}
//		}
//	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (obj) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票 ");
					}
				}
			} else {
				sellTicket();

			}
			x++;
		}
	}

	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票 ");
		} else {
			System.exit(0);
		}
	}
}

class Demo {
}
