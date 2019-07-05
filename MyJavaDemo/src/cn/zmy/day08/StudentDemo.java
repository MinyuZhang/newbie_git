package cn.zmy.day08;

class Student {
	static {
		System.out.println("static代码块");
	}
	{
		System.out.println("student构造代码块");
	}
	public Student() {
		System.out.println("student构造方法");
	}
}
public class StudentDemo {
	static {
		System.out.println("StudentDemo代码块");
	}
	public static void main(String[] args) {
		System.out.println("main方法");
		Student s = new Student();
	}
}