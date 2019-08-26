package cn.zmy.day22.itcast_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 我有一个文本文件(dos.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其实为”100”
 * 
 * 分析：
 * 		A:把文件中的数据加载到集合中
 * 		B:遍历集合，获取得到每一个键
 * 		C:判断键是否有为"lisi"的，如果有就修改其值为"100"
 * 		D:把集合中的数据重新存储到文件中
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\dos.txt")
				);
		pro.load(br);
			if (pro.containsKey("lisi")) {
				pro.setProperty("lisi", "100");
			} else {
				System.out.println("dos.txt文件中没有该属性");
			}
		br.close();
	}
}
