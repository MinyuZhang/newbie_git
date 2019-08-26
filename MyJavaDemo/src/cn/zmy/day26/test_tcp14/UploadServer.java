package cn.zmy.day26.test_tcp14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) {
		try {
			int i = 0;
			ServerSocket ss = new ServerSocket(10086);
			while(true) {
				Socket s = ss.accept();
				BufferedReader br = new BufferedReader(
						new InputStreamReader(s.getInputStream())
						);
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("E:\\Documents\\files\\dir\\copy" + i + ".txt")
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
				i ++;
				bwToClient.write("文件上传成功");
				bwToClient.newLine();
				bwToClient.flush();
				bw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
