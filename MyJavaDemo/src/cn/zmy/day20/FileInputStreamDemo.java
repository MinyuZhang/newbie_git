package cn.zmy.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					new File("E:\\Documents\\files\\fos.txt")
					);
//			int content = fis.read();
//			while(content != -1) {
//				System.out.print((char)content);
//				content = fis.read();
//			}
//			while ((content = fis.read()) != -1) {
//				System.out.print((char)content);
//			}
			byte []byt = new byte[2048];
			int len = 0;
			while ((len = fis.read(byt)) != -1) {
				System.out.println(new String(byt, 0, len));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
