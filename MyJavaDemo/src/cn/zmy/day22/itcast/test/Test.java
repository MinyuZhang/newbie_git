package cn.zmy.day22.itcast.test;

import java.io.IOException;
import java.util.Scanner;

import cn.zmy.day22.itcast.dao.UserDaoImpl;
import cn.zmy.day22.itcast.exception.Exception1;
import cn.zmy.day22.itcast.game.GuessNumber;
import cn.zmy.day22.itcast.pojo.User;

public class Test {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		UserDaoImpl udmp = new UserDaoImpl();
//		User user = new User("张敏宇", "123456zmy?");
//		udmp.registe(user);
//		boolean flag = udmp.login("张敏宇", "123456zmy?");
//		System.out.println(flag);
		while(true) {
			printMsg("欢迎光临");
			printMsg("1 登录");
			printMsg("2 注册");
			printMsg("3 退出");
			System.out.println("请输入你的选择");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				printMsg("请输入登录名：");
				String username = sc.next();
				printMsg("请输入登录密码：");
				String password = sc.next();
				boolean flag = udmp.login(username, password);
				if (flag) {
					GuessNumber.start();
				} else {
					throw new Exception1("登录失败");
				}
				break;
			case 2:
				printMsg("请输入登录名：");
				String username_new = sc.next();
				printMsg("请输入登录密码：");
				String password_new = sc.next();
				udmp.registe(new User(username_new, password_new));
				break;
			case 3:
				printMsg("See you later alligator^-^");
				System.exit(0);
				break;
			}
		}
	}
	public static void printMsg(String str) {
		System.out.println(str);
	}
}
