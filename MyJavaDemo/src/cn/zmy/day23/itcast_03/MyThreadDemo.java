package cn.zmy.day23.itcast_03;

public class MyThreadDemo {
	public static void main(String[] args) {
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		t1.setName("张敏宇");
//		t2.setName("卐读wan第四声||fu第二声");
//		t1.start();
//		t2.start();
		
		MyThread t3 = new MyThread("飞龙在天");
		MyThread t4 = new MyThread("沆瀣一气");
		t3.start();
		t4.start();
		System.out.println("线程名称: " + Thread.currentThread().getName());
		System.out.println("线程ID: " + Thread.currentThread().getId());
		System.out.println("线程优先级: " + Thread.currentThread().getPriority());
//		System.out.println(t3.getThreadGroup());
	}
}
