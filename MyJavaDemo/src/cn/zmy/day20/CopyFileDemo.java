package cn.zmy.day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Documents\\files\\fos.txt");
		FileOutputStream fos = new FileOutputStream("E:\\Documents\\files\\fos2.txt");
		
		int len = 0;
		long begin = System.currentTimeMillis();
		byte []byt = new byte[1024];
		while (fis.read(byt) != -1) {
			fos.write(byt, 0, len);
		}
		long finish = System.currentTimeMillis();
		System.out.println(begin - finish + "(ms)");
		fis.close();
		fos.close();
	}
}
