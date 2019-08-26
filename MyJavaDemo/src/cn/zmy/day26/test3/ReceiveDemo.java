package cn.zmy.day26.test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(24);
		byte []byt = new byte[1024];
		DatagramPacket dp = new DatagramPacket(byt, byt.length);
		ds.receive(dp);
		String ip = dp.getAddress().getHostAddress();
		String str = new String(byt, 0, byt.length);
		System.out.println(ip);
		System.out.println("conent: " + str);
		
	}
}
