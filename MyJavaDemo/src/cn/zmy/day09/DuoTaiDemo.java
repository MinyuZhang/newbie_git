package cn.zmy.day09;
class Fu{
	private int num = 100;
	
	public void show() {
		System.out.println("Fu");
	}
	public static void fun() {
		System.out.println("fun");
	}
	public int getNum() {
		return this.num;
	}
}
class Zi extends Fu{
	private int num = 200;
	private int num2 = 400;
	public int getZiNum() {
		return this.num;
	}
	public int getNum2() {
		return this.num2;
	}
	public void show() {
		System.out.println("Zi");
	}
	public void playGame() {
		System.out.println("Legendary");
	}
}
public class DuoTaiDemo {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.show();
		System.out.println(f.getNum());//获取得是父类中的num
		Zi f_self = (Zi)f;
		f_self.playGame();
	}
}
