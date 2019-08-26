package cn.zmy.day26.test_tcp8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		try {
			ss = new ServerSocket(24);
			s = ss.accept();
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream(), "UTF-8")
					);
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream(), "UTF-8")
					);
			while(true) {
				String str = br.readLine();
				System.out.println("the data from Client is " + str +
						"\tand the ip is " + s.getInetAddress().getHostAddress());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
