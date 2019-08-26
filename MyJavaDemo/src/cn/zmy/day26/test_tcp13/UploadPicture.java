package cn.zmy.day26.test_tcp13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class UploadPicture {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("172.23.24.218", 10086);
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("E:\\Documents\\files\\dir\\warm_tip.png")
					);
			BufferedOutputStream bos = new BufferedOutputStream(
					s.getOutputStream()
					);
			byte []byt = new byte[1024];
			int length = 0;
			while((length = bis.read(byt)) != -1) {
				bos.write(byt, 0, length);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
