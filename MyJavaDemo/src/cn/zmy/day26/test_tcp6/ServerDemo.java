package cn.zmy.day26.test_tcp6;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议接收数据：
 * A:创建接收端的Socket对象
 * B:监听客户端连接。返回一个对应的Socket对象
 * C:获取输入流，读取数据显示在控制台
 * D:释放资源
 */
public class ServerDemo {
	public static void main(String[] args) {
		try {
			// 创建接收端的Socket对象
			ServerSocket ss = new ServerSocket(24);
			// 监听客户端连接。返回一个对应的Socket对象
			Socket s = ss.accept();
			// 获取输入流
			InputStream is = s.getInputStream();
			
			byte []byt = new byte[1024];
			int length = is.read(byt);
			String message = new String(byt, 0, length);
			System.out.println("the ip is " + s.getInetAddress().getHostAddress() + ", the message is " + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
