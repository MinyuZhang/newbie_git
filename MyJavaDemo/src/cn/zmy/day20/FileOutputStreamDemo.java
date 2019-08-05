package cn.zmy.day20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		showFileOutputStream();// FileOutputStream
		
	}
	
	public static void showFileOutputStream() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(
					new File("E:\\Documents\\files\\fos.txt"), true
					);
			
//			fos.write("収".getBytes("UTF-8"));
//			fos.write(97);
			byte []byt = {97, 98, 100, 120};
			fos.write("\n".getBytes("UTF-8"));
			// Writes len bytes from the specified byte arraystarting at offset off to this file output stream
			fos.write(byt, 1, 3);;
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				// 为了保证close()一定会执行，就放到这里了
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
