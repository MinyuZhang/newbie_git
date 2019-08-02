package cn.zmy.day19;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("E:" + File.separator +"Documents" + File.separator + "files", "hello.txt");
//		System.out.println(file.getAbsolutePath());//E:\Documents\files\hello.txt
		try {
			boolean flag = file.exists();
			String fileName = file.getName();
			if (flag) {
				file.createNewFile();
				System.out.println(fileName + "创建成功");
			} else {
				System.out.println(fileName + "已经存在");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
