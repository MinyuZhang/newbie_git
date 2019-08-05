package cn.zmy.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFolderDemo {
	public static void main(String[] args) {
		// 复制多极文件夹
		File f1 = new File("E:\\Documents\\files\\dir1");
		File f2 = new File("E:\\Documents\\files\\dir1_copy");
		try {
			copyFolder(f1, f2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyFolder(File dir1, File dir2) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		if (dir1.isFile()) {
			br = new BufferedReader(
					new FileReader(dir1)
					);
			bw = new BufferedWriter(
					new FileWriter(dir2)
					);
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		}
		if (dir1.isDirectory()) {
			dir2.mkdir();
			File [] f = dir1.listFiles();
			for (File file : f) {
				copyFolder(file, new File(dir2, file.getName()));
			}
		}
		
		if (br != null) {
			br.close();
		}
		if (bw != null) {
			bw.close();
		}
	}
}
