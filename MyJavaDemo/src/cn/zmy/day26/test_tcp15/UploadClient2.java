package cn.zmy.day26.test_tcp15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient2 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("172.23.24.218", 4008);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("E:\\Documents\\files\\dir\\dos.txt")
							)
					);
			BufferedReader brFromServer = new BufferedReader(
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
			String msg = brFromServer.readLine();
			System.out.println("information from the server: " + msg);
			br.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
