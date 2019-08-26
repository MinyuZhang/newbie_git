package cn.zmy.day26.test_tcp15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(4008);
			while(true) {
				Socket s = ss.accept();
				UserThread ut = new UserThread(s);
				Thread t = new Thread(ut);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
