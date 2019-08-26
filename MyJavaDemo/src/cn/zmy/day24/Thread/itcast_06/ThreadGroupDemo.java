package cn.zmy.day24.Thread.itcast_06;

import cn.zmy.day23.itcast_05.MyRunnable;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		createThreadGroup();// 创建线程组
		threadGroupMethodsTest();// 线程组相关方法
	}
	public static void createThreadGroup() {
		ThreadGroup tg = new ThreadGroup("自定义的一个线程组");
		Test t = new Test();
		Thread t1 = new Thread(tg, t, "甲");
		Thread t2 = new Thread(tg, t, "乙");
//		t1.start();
//		t2.start();
		System.out.println(t1.getThreadGroup().getName());
//		System.out.println(t2.getThreadGroup());
		// daemon: 守护进程
		tg.setDaemon(true);// 通过组名称设置后台线程，表示该组的线程都是后台线程
	}
	public static void threadGroupMethodsTest() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		System.out.println(t1.getThreadGroup().getName());
	}
}
