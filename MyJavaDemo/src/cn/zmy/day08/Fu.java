package cn.zmy.day08;

public class Fu {
	public int num = 10;
	public Fu () {
		System.out.println("fu");
	}
}
class Zi extends Fu {
	int num = 20;
	public Zi() {
		System.out.println("zi");
	}
	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.show();
	}
}