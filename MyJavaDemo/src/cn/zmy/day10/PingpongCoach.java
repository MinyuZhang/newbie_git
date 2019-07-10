package cn.zmy.day10;

public class PingpongCoach extends Coach implements OralEnglish {
	public PingpongCoach() {}
	
	public PingpongCoach(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void speak() {
		System.out.println("乒乓球教练会说英语");
	}

	@Override
	public void teach() {
		System.out.println("乒乓球教练教乒乓球运动员发球与接球");
	}

	@Override
	public void showInterests() {
		System.out.println("乒乓球教练爱好教乒乓球运动员");
	}

}
