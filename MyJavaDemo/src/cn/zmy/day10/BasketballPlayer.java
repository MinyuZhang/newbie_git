package cn.zmy.day10;

public class BasketballPlayer extends People {
	public BasketballPlayer() {}
	
	public BasketballPlayer(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("篮球运动员吃牛肉");
	}
	@Override
	public void showInterests() {
		System.out.println("玩篮球就是最大的兴趣");
	}
}
