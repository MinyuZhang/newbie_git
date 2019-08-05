package cn.zmy.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class StringDemo {
	public static void main(String[] args) throws IOException {
		// 已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
		// 请编写程序读取数据内容，把数据排序后写入ss.txt中。
		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\dir1\\s.txt")
				);
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("E:\\Documents\\files\\dir1\\ss.txt")
				);
		String line = br.readLine();
		TreeSet<String> tree_set = new TreeSet<String>();
		for (String string : line.split("")) {
			tree_set.add(string);
		}
		StringBuffer sb = new StringBuffer();
		for (String string : tree_set) {
			sb.append(string);
		}
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
