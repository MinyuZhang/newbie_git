package cn.zmy.day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 数据来自于键盘录入
 * 键盘录入数据要自己控制录入结束。
 * 当录入“886”时结束录入
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		String line = null;
		while((line = br.readLine()) != "-1") {
			if ("886".equals(line)) {
				break;
			}
			// 创建数据并打包
			byte[]byt = line.getBytes();
			InetAddress inet= InetAddress.getByName("192.200.25.139");
			DatagramPacket dp = new DatagramPacket(byt, byt.length, inet, 24);
			
			// 发送数据
			ds.send(dp);
		}
		ds.close();
	}
}
