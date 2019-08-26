package cn.zmy.day26.test_tcp12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10086);
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream())
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("E:\\Documents\\files\\dir\\file_copy.txt")
							)
					);
			BufferedWriter bw2 = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream())
					);
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			bw2.write("文件上传成功");
			bw2.newLine();
			bw2.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
