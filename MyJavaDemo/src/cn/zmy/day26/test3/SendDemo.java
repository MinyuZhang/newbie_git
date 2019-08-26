package cn.zmy.day26.test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		
		String msg = "Hello udp, 我来了";
		byte []byt = msg.getBytes();
		int port = 24;
		
		InetAddress inet= InetAddress.getByName("192.200.25.139");
		DatagramPacket dp = new DatagramPacket(byt, byt.length, inet, port);
		
		ds.send(dp);
		ds.close();
		System.out.println("消息发送成功");
	}
}
