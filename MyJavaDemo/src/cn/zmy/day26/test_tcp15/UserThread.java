package cn.zmy.day26.test_tcp15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

public class UserThread implements Runnable {
	private Charset ch;
	private Socket s;
	
	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			String fileName = System.currentTimeMillis() + ".txt";
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream(), "gbk")
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("E:\\Documents\\files\\dir\\" + fileName), "gbk"
							)
					);
			BufferedWriter bwToClient = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream())
					);
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			bwToClient.write("文件上传成功");
			bwToClient.newLine();
			bwToClient.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
