package cn.zmy.day24.itcast_03;

public class Student {
	// 构造私有
	private Student() {}
	// 自己造一个
	// 静态方法只能访问静态成员变量，加静态
	// 为了不让外界直接访问修改这个值，加private
	private static Student s = new Student();
	
	public static Student getStudent() {
		return s;
	}
}
