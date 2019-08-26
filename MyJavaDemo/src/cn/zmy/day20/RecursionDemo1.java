package cn.zmy.day20;

import cn.zmy.day19.MyFirstException;

public class RecursionDemo1 {
	public static void main(String[] args) {
		displayRecursion();//递归
		try {
			displayRecursion2();// 演示斐波那契数列
		} catch (MyFirstException e) {
			e.printStackTrace();
		}
	}
	public static void displayRecursion() {
		// 需求：请用代码实现求5的阶乘。
		int result = factorialOfFive(5);
		System.out.println(result);
	}

	public static int factorialOfFive(int arg) {
		if (arg == 1) {
			return 1;
		} else {
			return arg *= factorialOfFive(arg - 1);
		}
	}
	
	public static void displayRecursion2() throws MyFirstException {
		/**
		 * 0 1 1 2 3 5 8 13 21 ...
		 *  有一对兔子，从出生后第3个月起每个月都生一对兔子，
		 *  小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？
		 */
		int result = 0;
		for(int i = 0; i <= 20; i ++) {
			result += factorialOfFibonacci(i);
		}
		System.out.println("第二十个月的兔子对数为：" + factorialOfFibonacci(20));
		System.out.println("第二十个月兔子总数为：" + result);
	}

	public static int factorialOfFibonacci(int arg) {
		if (arg == 0) {
			return 0;
		} else if (arg == 1) {
			return 1;
		} else if (arg >= 2) {
			return factorialOfFibonacci(arg - 1) + factorialOfFibonacci(arg - 2);
		} else {
			throw new MyFirstException("所填数字不能为负数");
		}
	}
}
