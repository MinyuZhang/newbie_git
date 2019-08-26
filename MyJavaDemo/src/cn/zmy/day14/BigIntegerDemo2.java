package cn.zmy.day14;

import java.math.BigInteger;

public class BigIntegerDemo2 {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("3");

		// public BigInteger add(BigInteger val):
		System.out.println("add:" + bi1.add(bi2));
		// public BigInteger subtract(BigInteger val);
		System.out.println("subtract:" + bi1.subtract(bi2));
		// public BigInteger multiply(BigInteger val):
		System.out.println("multiply:" + bi1.multiply(bi2));
		// public BigInteger divide(BigInteger val):
		System.out.println("divide:" + bi1.divide(bi2));

		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("商" + bis[0]);
		System.out.println("余数" + bis[1]);
	}
}