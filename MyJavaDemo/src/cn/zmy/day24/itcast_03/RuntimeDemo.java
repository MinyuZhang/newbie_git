package cn.zmy.day24.itcast_03;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
//		r.exec("shutdown -a");
//		r.exec("shutdown -s -t 10000");
		Process p = r.exec("ipconfig");
		
		System.out.println(r);
	}
}
