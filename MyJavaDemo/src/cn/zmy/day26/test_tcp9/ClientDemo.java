package cn.zmy.day26.test_tcp9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * 客户端从键盘录入，服务端将其存入文本文件
 * @author zmy
 *
 */
public class ClientDemo {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("192.168.0.4", 24);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in)
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream())
					);
			BufferedReader br2 = new BufferedReader(
					new InputStreamReader(s.getInputStream())
					);
			String line = null;
			while((line = br.readLine()) != null) {
				if ("over".equalsIgnoreCase(line)) {
					break;
				}
				bw.write(line);
				bw.newLine();
				bw.flush();
				
				/**
				 * 用于获取服务端发送回来的信息并打印至控制台
				 */
				char []ch = new char[1024];
				int length = br2.read(ch);
				String str = new String(ch, 0, length);
				System.out.println("Information from the server: " + str);
			}
			s.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
