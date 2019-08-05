package cn.zmy.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		read();
//		write();
	}
	public static void read() throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\fos.txt")
				);
		
		char []ch = new char[1024];
		int cha = 0;
		while ((cha = br.read(ch)) != -1) {
			System.out.println(new String(ch, 0, cha));
		}
//		String str = null;
//		while((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
		br.close();
	}
	
	public static void write() throws IOException {
		BufferedWriter bw = null;
		bw = new BufferedWriter(
				new FileWriter("E:\\Documents\\files\\fos.txt", true)
				);
		for (int i = 0; i < 10; i ++) {
			bw.write("张敏宇");
			bw.newLine();
		}
		
		bw.close();
	}
}
