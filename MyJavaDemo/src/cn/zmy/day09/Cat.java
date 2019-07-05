package cn.zmy.day09;

/**
 * 具体猫类
 * @author zmy
 *
 */
public class Cat extends Animal {
	public Cat() {}
	
	public Cat (String name, int age) {
		super(name, age);
	}
	
	@Override
	public void sleep() {
		System.out.println("猫喜欢在床上睡觉");
	}
	
}
