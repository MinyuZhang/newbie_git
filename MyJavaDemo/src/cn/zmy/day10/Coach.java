package cn.zmy.day10;

/**
 * 教练抽象类
 * @author zmy
 *
 */
public abstract class Coach extends People {
	public Coach() {}
	
	public Coach(String name, int age) {
		super(name, age);
	}
	
	public abstract void teach();
}
