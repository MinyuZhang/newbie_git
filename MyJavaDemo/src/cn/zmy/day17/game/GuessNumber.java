package cn.zmy.day17.game;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {
	}

	public static void start() {
		int number = (int) (Math.random() * 100) + 1;

		int count = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数据(1-100)：");
			int guessNumber = sc.nextInt();

			count++;

			// 判断
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你，" + count + "次就猜中了");
				break;
			}
		}
	}
}
