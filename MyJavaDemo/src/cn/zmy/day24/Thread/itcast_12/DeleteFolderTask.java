package cn.zmy.day24.Thread.itcast_12;

import java.io.File;
import java.util.TimerTask;

public class DeleteFolderTask extends TimerTask {
	public DeleteFolderTask() {}
	@Override
	public void run() {
		File dest = new File("E:\\Documents\\files\\dir1");
		deleteFolder(dest);// 递归删除目标文件--文件或目录
	}
	public void deleteFolder(File file) {
		File []arr = file.listFiles();
		if (arr != null) {
			// 是目录
			if (arr.length != 0) {
				for (File file2 : arr) {
					deleteFolder(file2);
				}
			}
		}
		file.delete();
	}
	public static void main(String[] args) {
		File dest = new File("E:\\Documents\\files\\dir1");
		deleteFolder2(dest);// 递归删除目标文件--文件或目录
	}
	public static void deleteFolder2(File file) {
		File []arr = file.listFiles();
		if (arr != null) {
			// 是目录
			if (arr.length != 0) {
				for (File file2 : arr) {
					deleteFolder2(file2);
				}
			}
		}
		file.delete();
	}
}
