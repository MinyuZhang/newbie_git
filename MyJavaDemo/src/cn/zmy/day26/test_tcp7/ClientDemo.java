package cn.zmy.day26.test_tcp7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("192.200.25.139", 24);
			OutputStream os = s.getOutputStream();
			String str ="Sorry, the number you have dialed is busy now, please redial later.";
			os.write(str.getBytes());
			
			InputStream is = s.getInputStream();
			byte []byt = new byte[1024];
			int length = is.read(byt);
			String receivedStr = new String(byt, 0, length);
			System.out.println("Information from the server: " + receivedStr);
			System.out.println();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
