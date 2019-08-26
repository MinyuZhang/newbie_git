package cn.zmy.day22.itcast.game;

import java.util.Scanner;

public class GuessNumber {
	private static Scanner sc;
	private static int guess;
	static {
		sc = new Scanner(System.in);
		printMsg("Please enter a number");
		guess = sc.nextInt();
	}
	public static void start() {
		int random = 0;
		while(true) {
			random = (int)(Math.random()*10 + 1);// [1, 10]
			if (random > guess) {
				printMsg("it's a little small a number");
				printMsg("please enter again");
				guess = sc.nextInt();
			} else if (random < guess) {
				printMsg("it's a little big a number");
				printMsg("please enter again");
				guess = sc.nextInt();
			} else if (random == guess) {
				printMsg("Congratulations! You'will♥. Try again? /yes");
				String isPlay = sc.next();
				if (!isPlay.equalsIgnoreCase("yes")) {
					printMsg("See you later alligator!");
					System.exit(0);
				} else {
					System.err.println(random);
					printMsg("Please enter a number");
					guess = sc.nextInt();
				}
			}
		}
	}
	public static void printMsg(String str) {
		System.out.println(str);
	}
}
