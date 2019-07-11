package cn.zmy.day11;

abstract class Something{
	public abstract String doSomething(String name);
}
public class Day11 {
	private String s = "";
	void doSomething() {
//		private String s = "";
		int l = s.length();
	}
	public int add(final int i) {
		return i;
	}
	public static void main(String[] args) {
		Day11 d11 = new Day11();
		int i = d11.add(2);
		System.out.println(i);
	}
}
