package cn.zmy.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		String srcString = "C:\\Users\\zmy\\newbie_git\\MyJavaDemo\\.project";
		String destString = "E:\\Documents\\files\\copy.project.txt";
		method5(srcString, destString);
	}

	private static void method5(String srcString, String destString)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		bw.close();
		br.close();
	}
	
}
