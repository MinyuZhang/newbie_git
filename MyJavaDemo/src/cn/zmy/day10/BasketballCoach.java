package cn.zmy.day10;

public class BasketballCoach extends Coach {
	public BasketballCoach() {}
	
	public BasketballCoach(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void teach() {
		System.out.println("篮球教练教篮球运动员打篮球");
	}

	@Override
	public void showInterests() {
		System.out.println("篮球教练喜欢教篮球运动员们打篮球");
	}

}
