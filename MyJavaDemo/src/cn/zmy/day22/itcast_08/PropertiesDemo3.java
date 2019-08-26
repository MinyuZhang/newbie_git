package cn.zmy.day22.itcast_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		myLoad();
//		myStore();
	}

	private static void myStore() throws IOException {
		Properties prop = new Properties();

		prop.setProperty("唐伯虎", "27");
		prop.setProperty("祝英台", "30");
		prop.setProperty("梁山伯", "18");
		
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("E:\\Documents\\files\\dos.txt")
				);
		// prop.store(Writer, Comments);
		prop.store(bw, "characters");
		bw.close();
	}

	private static void myLoad() throws IOException {
		Properties prop = new Properties();

		BufferedReader br = new BufferedReader(
				new FileReader("E:\\Documents\\files\\dos.txt")
				);
		prop.load(br);
		System.out.println(prop);
		br.close();
	}
}
