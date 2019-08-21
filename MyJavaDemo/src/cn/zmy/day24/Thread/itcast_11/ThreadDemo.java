package cn.zmy.day24.Thread.itcast_11;

/**
 * 
 * @author zmy
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
//		new Thread() {
//			public void run() {
//				for (int i = 0; i < 100; i ++) {
//					System.out.println(getName() + ": " + i);
//				}
//			}
//		}.start();

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i ++) {
//					System.out.println(Thread.currentThread().getName() + ": " + i);
//				}
//			}
//		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "Hello: " + i);
				}
			}

		}) {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "World: " + i);
				}
			}
		}.start();
	}
}
