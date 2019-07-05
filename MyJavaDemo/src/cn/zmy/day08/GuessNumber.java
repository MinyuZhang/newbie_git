package cn.zmy.day08;

import java.util.Scanner;

public class GuessNumber {
	private static Scanner sc;
	private static int gold;
	
	static {
		sc = new Scanner(System.in);
		gold = (int)(Math.random()*10);
	}
	
	public static void main(String[] args) {
		int count = 0;
		while(count < 5) {
			System.out.println("请输入你猜的数字：");
			int num = sc.nextInt();
			if (gold == num) {
				System.out.println("你猜对了");
				break;
			} else if (gold < num) {
				System.out.println("你猜大了");
			} else {
				System.out.println("你猜小了");
			}
		}
	}
}