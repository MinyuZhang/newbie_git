package cn.zmy.day22.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
//		read();
		copy();
	}
	
	public static void read() throws IOException {
		InputStream s1 = new FileInputStream("E:\\Documents\\files\\fos.txt");
		InputStream s2 = new FileInputStream("E:\\Documents\\files\\dos.txt");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);
		
		byte []byt = new byte[4096];
		int len = 0;
		while((len = sis.read(byt)) != -1) {
			System.out.println((new String(byt, 0, len)));
		}
		s1.close();
		s2.close();
		sis.close();
	}
	
	public static void copy() throws IOException {
		InputStream s1 = new FileInputStream("E:\\Documents\\files\\fos.txt");
		InputStream s2 = new FileInputStream("E:\\Documents\\files\\dos.txt");
		Vector<InputStream> list = new Vector<InputStream>();
		list.add(s1);
		list.add(s2);
		Enumeration<InputStream> en = list.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("E:\\Documents\\files\\file.txt")
				);
		
		byte []byt = new byte[2048];
		int len = 0;
		while((len = sis.read(byt)) != -1) {
			bos.write(byt, 0, len);
		}
		sis.close();
		bos.close();
	}
	
}
