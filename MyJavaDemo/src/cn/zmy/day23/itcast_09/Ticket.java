package cn.zmy.day23.itcast_09;

public class Ticket implements Runnable {
	private static int tickets = 100;
	Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "正在出售" + tickets + "张票");
					tickets--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
//						e.printStackTrace();
						System.err.println(Thread.currentThread().getName() + "线程异常中止");
					}
				} else {
					System.out.println(Thread.currentThread().getName() + "sold out");
					break;
				}
			}
		}
	}

}
