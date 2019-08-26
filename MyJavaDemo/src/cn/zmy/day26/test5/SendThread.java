package cn.zmy.day26.test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	private int port;
	private DatagramSocket ds;
	private DatagramPacket dp;
	
	public SendThread(DatagramSocket ds, int port) {
		this.ds = ds;
		this.port = port;
	}

	@Override
	public void run() {
		String line = null;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		try {
			InetAddress address = InetAddress.getByName("192.200.25.139");
			while((line = br.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}
				byte []buf = line.getBytes();
				dp = new DatagramPacket(buf, buf.length, address, port);
				ds.send(dp);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		ds.close();
	}

}
