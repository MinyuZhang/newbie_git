package cn.zmy.day19;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo2 {
	public static void main(String[] args) {
//		displayCreateFileAndDirectory();// 创建文件与目录及多级目录
//		displayRenameFile();// rename file
//		displayListAndListFiles();// File.list() and File.listFiles();
		displayFileFilter();//文件过滤器
	}

	// 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
	public static void displayFileFilter() {
		File f = new File("E:\\");
		String[] list = f.list(new FilenameFilter() {

			/**
			 * File dir: 目录 String name: 文件
			 */
			@Override
			public boolean accept(File dir, String name) {
				File f = new File(dir, name);
				return f.isFile() && f.getName().endsWith("jpg");
			}
		});
		showMsg(list.length + "");
	}

	public static void displayListAndListFiles() {
		File f1 = new File("E:\\Documents\\files");
		String[] list1 = f1.list();
		File[] list2 = f1.listFiles();
		for (String str : list1) {
			showMsg(str);
		}
		for (File f : list2) {
			showMsg("isFile?" + f.isFile());
		}
	}

	public static void displayRenameFile() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		File f1 = new File("E:\\Documents\\files\\収.jpg");
		File f2 = new File("E:\\Documents\\files\\卍卐.jpg");
//		showMsg(f1.getPath());//相对路径
//		showMsg(f1.getAbsolutePath());//绝对路径
//		showMsg(String.valueOf(f2.lastModified()));
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(f2.lastModified());
		showMsg(sdf.format(c.getTime()));
		try {
			f1.createNewFile();
			showMsg("success");
			f1.renameTo(f2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void displayCreateFileAndDirectory() {
		File f1 = new File("E:\\Documents\\files");
		File f2 = new File(f1, "file.txt");
		File f3 = new File(f1, "aaa\\bbb\\ccc");
		File f4 = new File(f3, "ddd\\file.txt");

		boolean flag1 = f1.mkdir();
		showMsg("mkdir: " + flag1);

		try {
			boolean flag2 = f2.createNewFile();
			showMsg("createNewFile: " + flag2);
			boolean flag3 = f3.mkdirs();
			showMsg("mkdirs: " + flag3);
			if (f4.exists()) {
				showMsg("f4 detected, deleting it");
				f4.delete();
			} else {
				showMsg("f4 not detected, creating new...");
				f4.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void showMsg(String msg) {
		System.out.println(msg);
	}
}
