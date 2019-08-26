package cn.zmy.day26.test_tcp13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10086);
			Socket s = ss.accept();
			BufferedInputStream bis = new BufferedInputStream(
					s.getInputStream()
					);
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("E:\\Documents\\files\\dir\\warm_tip_copy.png")
					);
			int len = 0;
			byte []byt = new byte[1024];
			while((len = bis.read(byt)) != -1) {
				bos.write(byt, 0, len);
			}
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
