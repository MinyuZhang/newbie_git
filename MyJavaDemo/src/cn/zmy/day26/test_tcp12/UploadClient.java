package cn.zmy.day26.test_tcp12;

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
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("E:\\Documents\\files\\dir\\file.txt")
							)
					);
			BufferedReader br2 = new BufferedReader(
					new InputStreamReader(s.getInputStream())
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
			String client = br2.readLine();
			System.out.println("information from the server: " + client);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
