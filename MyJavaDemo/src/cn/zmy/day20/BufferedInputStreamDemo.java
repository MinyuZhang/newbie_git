package cn.zmy.day20;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// BufferedInputStream(InputStream in)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"D:\\PRODEV\\workspace4.3.1\\app-front-mbank\\gulpfile.js"));

		// int by = 0;
		// while ((by = bis.read()) != -1) {
		// System.out.print((char) by);
		// }
		// System.out.println("---------");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		bis.close();
	}
}
