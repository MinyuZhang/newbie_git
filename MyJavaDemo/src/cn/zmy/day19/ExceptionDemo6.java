package cn.zmy.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * throw:如果出现了异常情况，我们可以把该异常抛出，这个时候的抛出的应该是异常的对象。
 * 
 * throws和throw的区别(面试题)
	throws
		用在方法声明后面，跟的是异常类名
		可以跟多个异常类名，用逗号隔开
		表示抛出异常，由该方法的调用者来处理
		throws表示出现异常的一种可能性，并不一定会发生这些异常
	throw
		用在方法体内，跟的是异常对象名
		只能抛出一个异常对象名
		表示抛出异常，由方法体内的语句处理
		throw则是抛出了异常，执行throw则一定抛出了某种异常
 */
public class ExceptionDemo6 {
	public static void main(String[] args) {
		System.out.println("it's a nice day");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("but the fog is disgusting");
		
		int abc = 123;
		int def = 0;
		if (def == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(abc / def);
		}
	}

	// 运行期异常的抛出--算术异常
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
	// 编译期异常的抛出
	public static void method() throws ParseException {
		String s = "2019-08-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
}
