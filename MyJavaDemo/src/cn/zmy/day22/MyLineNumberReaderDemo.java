package cn.zmy.day22;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		MyLineNumberReader mlnr = new MyLineNumberReader(
				new FileReader("E:\\Documents\\files\\dir1_copy\\s.txt")
				);
		String line = null;
		while((line = mlnr.readLine()) != null) {
			System.out.println(line + "--" + mlnr.getLinenumber());
		}
		
		mlnr.close();
	}
}
