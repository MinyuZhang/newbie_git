package cn.zmy.day07;

public class Day07 {
	/**
	 * Student student = new Student ();
	 * 1.将Student.class文件加载到内存；
	 * 2.在栈内存中为Student<引用变量>分配空间；
	 * 3.在堆内存中为Student对象分配空间；
	 * 4.给Student对象的成员变量进行默认初始化；
	 * 5.给Student对象的成员变量赋值；
	 * 6.将Student对象在堆内存中的首地址赋给栈内存中的引用变量student，对象构造完毕。
	 */
	public static void main(String[] args) {
		
		//方式一
		Student student = new Student ();
		student.setName("小明");
		student.setAge(22);
		System.out.println(student.toString());
		
		//方式二
		Student student2 = new Student("张敏宇", 23);
		System.out.println(student2.toString());
		
	}
}