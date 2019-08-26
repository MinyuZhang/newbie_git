package cn.zmy.day26.test_tcp7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(24);
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			byte []byt = new byte[1024];
			int length = is.read(byt);
			String str = new String(byt, 0, length);
			System.out.println("Information from the client: " + str);
			
			OutputStream os = s.getOutputStream();
			String sendStr = "已经收到";
			os.write(sendStr.getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
