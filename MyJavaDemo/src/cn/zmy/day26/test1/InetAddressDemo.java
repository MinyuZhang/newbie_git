package cn.zmy.day26.test1;

import java.io.IOException;
import java.net.InetAddress;

/**
 * public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到IP地址对象
 * @author zmy
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws IOException {
		InetAddress inet = InetAddress.getByName("192.200.25.139");
		// 获取主机名，IP地址
		String host = inet.getHostName();
		String ip = inet.getHostAddress();
		System.out.println("host: " + host + "\tip: " + ip);
	}
}
