package cn.zmy.day26.test_tcp11;

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
					new InputStreamReader(s.getInputStream(), "UTF-8")
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("E:\\Documents\\files\\dir\\userinfo_copy.properties"), "GBK"
							)
					);
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
