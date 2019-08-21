package cn.zmy.day24.Thread.itcast_05;

public class Student {
	private String name;
	private int age;
	private boolean flag;// true-有数据; false-无数据

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
