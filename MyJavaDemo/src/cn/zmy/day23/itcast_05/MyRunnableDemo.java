package cn.zmy.day23.itcast_05;

/*
 * 方式2：实现Runnable接口
 * 步骤：
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run()方法
 * 		C:创建MyRunnable类的对象
 * 		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();

		// Thread(Runnable target, String name)
		Thread t1 = new Thread(my, "陆地装甲");
		Thread t2 = new Thread(my, "LOCK&LOCK");

		t1.start();
		t2.start();
	}
}