package cn.zmy.day22.itcast_08;

import java.util.Scanner;

public class GuessNumber {
	private static Scanner sc;
	private static int random;
	private static int guess;
	static {
		sc = new Scanner(System.in);
		printMsg("Please enter a number");
		guess = sc.nextInt();
	}
	public static void printMsg(String str) {
		System.out.println(str);
	}
	public static void start() {
		random = (int)Math.random()*10 + 1;// [1,10]
		while(true) {
			if (random > guess) {
				printMsg("it's a little small a number");
				printMsg("please enter again");
				guess = sc.nextInt();
			} else if (random < guess) {
				printMsg("it's a little big a number");
				printMsg("please enter again");
				guess = sc.nextInt();
			}
			printMsg("Congratulations! You'will♥. Try again? /yes");
			String isPlay = sc.next();
			if (!isPlay.equalsIgnoreCase("yes")) {
				printMsg("See you later alligator!");
				break;
			} else {
				printMsg("Please enter a number");
				guess = sc.nextInt();
			}
		}
	}
	public static void main(String[] args) {
		start();
	}
}
