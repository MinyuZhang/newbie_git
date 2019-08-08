package cn.zmy.day22.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 * 字节数组：
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; i < 10; i ++) {
			switch(i % 4) {
			case 0:
				baos.write("♥".getBytes());
				break;
			case 1:
				baos.write("♠".getBytes());
				break;
			case 2:
				baos.write("♦".getBytes());
				break;
			case 3:
				baos.write("♣".getBytes());
			default:
					break;
			}
		}
		byte []buf = baos.toByteArray();
//		System.out.println(new String(buf));
//		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
//		int len = 0;
//		while ((len = bais.read()) != -1) {
//			System.out.println(new String(buf));
//		}
	}
	
}
