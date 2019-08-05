package cn.zmy.day22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataToArrayListDemo {
	public static void main(String[] args) throws IOException {
		// 需求：从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\fos.txt")
				);
		String line = null;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		for (String str : list) {
			System.out.println(str);
		}
		br.close();
	}
}
