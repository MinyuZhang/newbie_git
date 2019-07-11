package cn.zmy.day11;

interface AA {
	void play();
}

interface BB {
	void play();
}

interface CC extends AA, BB {
	Ball ball = new Ball("volleyball");
}

class Ball implements CC {
	private String name;

	public Ball() {
	}

	public String getName() {
		return this.name;
	}

	public Ball(String name) {
		this.name = name;
	}

	@Override
	public void play() {
//		ball = new Ball("soccer");
		System.out.println(ball.name);//一定是接口中定义的名字
		System.out.println(this.name);//取决于外在调用时的定义
	}

	public static void main(String[] args) {
		System.out.println("Ball");
		ball.getName();
	}
}

public class InterfaceDefineClass {
	public static void main(String[] args) {
		Ball b = new Ball("soccer");
		b.play();
	}
}