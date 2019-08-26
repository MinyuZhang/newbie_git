package cn.zmy.day26.test_tcp14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("172.23.24.218", 10086);
			BufferedReader brServer = new BufferedReader(
					new InputStreamReader(s.getInputStream())
					);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("E:\\Documents\\files\\dir\\copy.project.txt")
							)
					);
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream())
					);
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			s.shutdownOutput();
			String msg = brServer.readLine();
			System.out.println("information from the server: " + msg);
			br.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
