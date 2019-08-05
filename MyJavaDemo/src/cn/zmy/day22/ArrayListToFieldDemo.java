package cn.zmy.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFieldDemo {
	public static void main(String[] args) throws IOException {
		//把ArrayList集合中的字符串数据存储到文本文件
		ArrayList<String> list = new ArrayList<String>();
		list.add("语文");
		list.add("数学");
		list.add("英语");
		
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("E:\\Documents\\files\\fos.txt", true)
				);
		for (String string : list) {
			bw.write(string);
			bw.newLine();
		}
		bw.close();
	}
}
