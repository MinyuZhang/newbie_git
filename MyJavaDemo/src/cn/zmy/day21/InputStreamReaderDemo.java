package cn.zmy.day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		try {
//			method1();// 一次读一个字节
			method2();// 一次读一个字节数组
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method2() throws IOException {
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("E:\\Documents\\files\\fos.txt"), "UTF-8"
				);
		char []ch = new char[1024];
		int len = 0;
		while((len = isr.read(ch)) != -1) {
			System.out.print(new String(ch, 0, len));
		}
		isr.close();
	}
	
	public static void method1() throws IOException {
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("E:\\Documents\\files\\fos.txt"), "UTF-8"
				);
		int ch = 0;
		while((ch = isr.read()) != -1) {
			System.out.print((char)ch);
		}
		isr.close();
	}
}
