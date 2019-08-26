package cn.zmy.day14;

import java.math.BigInteger;

public class BigIntegerDemo1 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi:" + bi);
		System.out.println(bi.getClass().getTypeName());
		System.out.println(bi.getClass().getSimpleName());//BigInteger
	}
}