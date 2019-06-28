package cn.zmy.Day03;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		short s = 1;
		s += 1;
		int a = 2;
		String str = "3";
		
		System.out.println(s);
		System.out.println(str.equals("3") ^ a == 2);//^: 相同则为false,不同则为true
		System.out.println("2乘以2的结果是：" + (2<<1));
		System.out.println("2乘以4的结果是：" + (2<<2));
		System.out.println("2乘以8的结果是：" + (2<<3));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int int1 = scanner.nextInt();
		System.out.println("请输入第二个数据：");
		int int2 = scanner.nextInt();
		System.out.println("请输入第三个数据：");
		int int3 = scanner.nextInt();
		int max = 0;
		max = int1 > int2 ? (int1 > int3 ? int1 : int3) : (int2 > int3 ? int2 : int3);
		System.out.println("这三个数中最大的数是：" + max);
		scanner.close();
	}
}
