package cn.zmy.day26.test_tcp10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) {
		try {
			// 创建客户端Socket连接
			Socket s = new Socket("192.168.0.4", 24);
			// 封装缓冲输入流，读取文件内容
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream("E:\\Documents\\files\\dir\\file.txt"))
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream(), "UTF-8")
					);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			br.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
