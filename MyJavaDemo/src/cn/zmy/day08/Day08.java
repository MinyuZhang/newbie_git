package cn.zmy.day08;

public class Day08 {
	public static void main(String[] args) {
		//0<=d<1;
		double d = Math.random();
		System.out.println(d);
		
		for (int i = 0; i < 50; i ++) {
			int random = (int)(Math.random()*100) + 1;
			System.out.println(random);
		}
	}
}