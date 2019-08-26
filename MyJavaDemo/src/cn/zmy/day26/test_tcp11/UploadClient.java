package cn.zmy.day26.test_tcp11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) {
		Socket s = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			s = new Socket("192.168.0.4", 10086);
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("E:\\Documents\\files\\dir\\userinfo.properties"))
					);
			bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream(), "UTF-8")
					);
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
