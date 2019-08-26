package cn.zmy.day26.test5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket ds;

	public ReceiveThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		while(true) {
			try {
				byte []buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData());
				System.out.println("the ip is " + ip + " and the data is " + data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
