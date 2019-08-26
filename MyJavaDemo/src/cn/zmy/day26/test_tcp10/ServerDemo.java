package cn.zmy.day26.test_tcp10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class ServerDemo {
	public static void main(String[] args) {
		try {
			// 创建服务器Socket对象
			ServerSocket ss = new ServerSocket(24);
			// 监听客户端连接
			Socket s = ss.accept();
			// 创建缓冲流
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream(), "UTF-8")
					);
			// 读取流中数据并输出至控制台
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println("information from the client: " + line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
