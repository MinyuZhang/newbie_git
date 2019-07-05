package cn.zmy.day09;

/**
 * 抽象动物类
 * @author zmy
 *
 */
public abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {}

	public Animal(String name, int age) {
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
		return "[name=" + name + ", age=" + age + "]";
	}

	public abstract void sleep();
	
	public void eat() {
		System.out.println("吃饭");
	}
}
