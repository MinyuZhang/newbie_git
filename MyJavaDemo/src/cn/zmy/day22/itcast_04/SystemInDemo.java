package cn.zmy.day22.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("请输入一个字符串：");
		String line = br.readLine();
		System.out.println("你输入的字符串是：" + line);

		System.out.println("请输入一个整数：");
		// int i = Integer.parseInt(br.readLine());
		line = br.readLine();
		int i = Integer.parseInt(line);
		System.out.println("你输入的整数是：" + i);
	}
}
