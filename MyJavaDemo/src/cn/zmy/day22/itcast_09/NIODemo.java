package cn.zmy.day22.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
 * nio包在JDK4出现，提高了IO流的操作效率。但是目前还不是大范围的使用。
 * 有空的话了解下，有问题再问我。
 * 
 * JDK7的之后的nio：
 * Path:路径
 * Paths:有一个静态方法返回一个路径
 * 		public static Path get(URI uri)
 * Files:提供了静态方法供我们使用
 * 		public static long copy(Path source,OutputStream out):复制文件
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options)
 */
public class NIODemo {
	public static void main(String[] args) throws IOException {
//		List<String> list = new ArrayList<String>();
//		list.add("nio");
//		list.add("提高了IO流的操作效率");
		String uri = "E:\\Documents\\files\\nio_demo.txt";
//		BufferedWriter bw = Files.newBufferedWriter(Paths.get(uri), Charset.forName("GBK"));
		BufferedReader br = Files.newBufferedReader(Paths.get(uri), Charset.forName("GBK"));
//		bw.write("卍");
//		System.out.println("done");
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
//		bw.close();
		br.close();
	}
}