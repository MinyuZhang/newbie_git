package cn.zmy.day26.test_tcp8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.200.25.139", 24);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in, "UTF-8")
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream(), "UTF-8")
					);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
			String line = null;
			while((line = br.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}
				bw.write(line);
				bw.newLine();
				// 将缓冲区中的内容写入
				bw.flush();
			}
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
