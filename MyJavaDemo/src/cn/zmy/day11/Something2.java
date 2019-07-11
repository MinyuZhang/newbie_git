package cn.zmy.day11;

class Other{
	public int i;
}
public class Something2 {
	public static final String s = "1123abc";
	public static void main(String[] args) {
		System.out.println(s);
		Other o = new Other();
		new Something2().addOne(o);
		System.out.println("Something2 returns " + new Something2().doSomething());
	}
	
	public void addOne(final Other o) {
		System.out.println(o.i++);
	}
	
	public String doSomething() {
		return "Do something...";
	}
}