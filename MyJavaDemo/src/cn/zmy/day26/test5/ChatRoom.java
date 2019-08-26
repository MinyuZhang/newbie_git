package cn.zmy.day26.test5;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket dSend = new DatagramSocket();
		DatagramSocket dRece = new DatagramSocket(24);
		
		SendThread st = new SendThread(dSend, 24);
		ReceiveThread rt = new ReceiveThread(dRece);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();
	}
}
