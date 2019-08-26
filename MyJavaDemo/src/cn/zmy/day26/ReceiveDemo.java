package cn.zmy.day26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 创建数据接收Socket
		DatagramSocket ds = new DatagramSocket(24);
		while(true) {
			byte [] byt = new byte[1024];
			// 创建一个包裹
			DatagramPacket dp = new DatagramPacket(byt, byt.length);
			// 接收数据
			ds.receive(dp);
			// 解析数据
			String ip = dp.getAddress().getHostAddress();
			String str = new String(byt, 0, byt.length);
			System.out.println("from " + ip + "\ndata:" + str);
		}
		// 释放资源
		// 接收端应该一直开着等待接收数据，是不需要关闭
		// ds.close();
	}
}
