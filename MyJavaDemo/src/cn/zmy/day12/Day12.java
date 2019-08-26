package cn.zmy.day12;

import java.lang.reflect.Field;

public class Day12 {
	public static void main(String[] args) throws Exception {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";

		// 获取String类中的value字段
		Field fieldValueOfString = String.class.getDeclaredField("value");
		// 改变value属性的访问权限
		fieldValueOfString.setAccessible(true);
		// 获取ss1对象上的value属性的值
		char[] value = (char[]) fieldValueOfString.get(s1);
		value[4] = 'e';

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s3 == s4);
		
		// test some methods of String
		someMethodsOfString();
	}
	public static void someMethodsOfString() {
		String str1 = "TheSpecter";
		String str2 = "theSpecter";
		String str3 = "AlanWalker-TheSpecter";
		String str4 = "ILoveAlanWalker's song--thespecter";
		// boolean equalsIgnoreCase(String str)
		System.out.println(str1.equalsIgnoreCase(str2));
		// boolean contains(String str)
		System.out.println(str3.contains(str1));
		System.out.println(str3.contains(str2));
		// boolean startsWith(String str)
		// boolean endsWith(String str)
		// boolean isEmpty()
	}
}
