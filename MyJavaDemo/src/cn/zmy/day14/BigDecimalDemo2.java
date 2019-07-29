package cn.zmy.day14;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
	public static void main(String[] args) {
		// System.out.println(0.09 + 0.01);
		// System.out.println(1.0 - 0.32);
		// System.out.println(1.015 * 100);
		// System.out.println(1.301 / 100);

		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));
		System.out.println("-------------------");

		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));
		System.out.println("-------------------");

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:" + bd5.multiply(bd6));
		System.out.println("-------------------");

		BigDecimal bd7 = new BigDecimal("901.567");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));//this / divisor 1.301 / 100 = 0.01301
		System.out.println("divide:" + bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));//四舍五入模式
		System.out.println("divide:" + bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
		System.out.println(bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_DOWN));
	}
}
