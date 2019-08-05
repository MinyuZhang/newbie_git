package cn.zmy.day20;

import java.io.File;

public class FileDeleteDemo {
	public static void main(String[] args) {
		/**
		 * 需求：递归删除带内容的目录
		 */
//		File f = new File("E:\\Documents\\files");
//		deleteDirectoryByRecursion(f);
//		printMsg("done");
		
		/**
		 * 请大家把D:\PRODEV\workspace4.3.1\MyJavaDemo目录下所有的java结尾的文件的绝对路径给输出在控制台。
		 */
		File baseDir = new File("D:\\PRODEV\\workspace4.3.1");
		long time1 = System.currentTimeMillis();
		listJavaFiles(baseDir);
		long time2 = System.currentTimeMillis();
		System.out.println("共花费：" + (time2 - time1) + "毫秒");
	}
	
	public static void listJavaFiles(File dir) {
		File []list = dir.listFiles();
		if (list != null) {
			for (File file : list) {
				if (file.isDirectory()) {
					listJavaFiles(file);
				} else if (file.getName().endsWith("java")){
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
	
	public static void deleteDirectoryByRecursion(File file) {
		File []files = file.listFiles();
		if (files != null) {
			for (File file2 : files) {
				if (file2.isDirectory()) {
					deleteDirectoryByRecursion(file2);
				} else if(file2.isFile() && file2.getName().endsWith("png")) {
					file2.delete();
				}
			}
			file.delete();
		}
	}
	
	public static void printMsg(String str) {
		System.out.println(str);
	}
	
	public static void printMsg(boolean bool) {
		System.out.println(bool);
	}
}
