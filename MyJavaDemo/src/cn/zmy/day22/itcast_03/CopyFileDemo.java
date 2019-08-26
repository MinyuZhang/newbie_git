package cn.zmy.day22.itcast_03;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\BufferedOutputStreamDemo.java")
				);
		PrintWriter pw = new PrintWriter(
				new FileOutputStream("E:\\Documents\\files\\fos.txt", true)
				);
		int len = 0;
		while((len = br.read()) != -1) {
			pw.print((char)len);
		}
		
		br.close();
		pw.close();
	}
}
