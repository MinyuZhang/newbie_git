package cn.zmy.day24.Thread.itcast_03;

/*
 * 分析：
 * 		资源类：Student	
 * 		设置学生数据:SetThread(生产者)
 * 		获取学生数据：GetThread(消费者)
 * 		测试类:StudentDemo
 * 
 * 问题1：按照思路写代码，发现数据每次都是:null---0
 * 原因：我们在每个线程中都创建了新的资源,而我们要求的时候设置和获取线程的资源应该是同一个
 * 如何实现呢?
 * 		在外界把这个数据创建出来，通过构造方法传递给其他的类。
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		SetThread st = new SetThread(student);
		GetThread gt = new GetThread(student);
		
		
//		Thread t1 = new Thread(st);
//		Thread t2 = new Thread(gt);
//		t1.start();
//		t2.start();
	}
}
