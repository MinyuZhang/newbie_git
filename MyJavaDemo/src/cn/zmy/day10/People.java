package cn.zmy.day10;

/**
 * 人抽象类
 * @author zmy
 *
 */
public abstract class People {
	private String name;
	private int age;

	public People() {}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

	public void eat() {
		System.out.println("每一个人都要吃饭");
	}
	
	public abstract void showInterests();
}
