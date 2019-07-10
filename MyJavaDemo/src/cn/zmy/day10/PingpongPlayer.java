package cn.zmy.day10;

public class PingpongPlayer extends People {
	public PingpongPlayer() {}
	
	public PingpongPlayer(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("乒乓球运动员吃大白菜");
	}
	@Override
	public void showInterests() {
		System.out.println("玩乒乓球就是最大的兴趣");
	}

}
