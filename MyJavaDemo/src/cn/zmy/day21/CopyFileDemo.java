package cn.zmy.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\upgrade.exe")
				);
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("E:\\Documents\\files\\upgrade2.exe")
				);
		int len = 0;
		char []ch = new char[2048];
		while ((len = br.read(ch)) != -1) {
			bw.write(ch, 0, len);
		}
		
		br.close();
		bw.close();
		
	}
}
