package cn.zmy.day21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream("E:\\Documents\\files\\fos.txt", true), "UTF-8"
//				);
//		osw.write("瘟疫");
//		osw.close();
		
		method();//一次写一个字节数组
	}
	public static void method() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("E:\\Documents\\files\\fos.txt", true), "UTF-8"
				);		
		char []cbuf = new char[]{'a', 'b', 'c', '我', '爱', '玩', '蹦', '极'};
		osw.write(cbuf, 3, 5);
//		String str = "我爱玩蹦极";
//		osw.write(str, 2, 3);
//		osw.flush();//将缓冲区的内容写入文件中
//		System.exit(0);
		osw.close();
	}
}
