package cn.zmy.day22;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(
				new FileReader("E:\\Documents\\files\\dir1_copy\\s.txt")
				);
		String line = null;
		while ((line = mbr.readLine()) != null) {
			System.out.println(line);
		}
		mbr.close();
	}
}
