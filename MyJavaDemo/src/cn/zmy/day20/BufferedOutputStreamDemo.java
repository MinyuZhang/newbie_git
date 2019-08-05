package cn.zmy.day20;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(
					new FileOutputStream("E:\\Documents\\files\\fos.txt")
					);
			bos.write("hello".getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
