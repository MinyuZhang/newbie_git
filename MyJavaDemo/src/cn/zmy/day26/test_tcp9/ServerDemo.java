package cn.zmy.day26.test_tcp9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(24);
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream())
					);
			BufferedWriter b2 = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream())
					);
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Documents\\files\\dir\\file.txt", true));
			while(true) {
				String line = null;
				/**
				 * 将数据写入指定文件
				 */
				if ((line = br.readLine()) != null) {
					bw.write(line);
					bw.newLine();
					bw.flush();
					String ip = s.getInetAddress().getHostAddress();
					System.out.println("the ip is " + ip + "\t and the message is " + line);
					
					b2.write("消息已经收到");
					b2.newLine();
					b2.flush();
				} 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
