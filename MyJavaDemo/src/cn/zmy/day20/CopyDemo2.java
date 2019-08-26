package cn.zmy.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("E:\\Documents\\files\\upgrade.exe"));
			bos = new BufferedOutputStream(new FileOutputStream("E:\\Documents\\files\\upgrade_copy.exe"));
			int len = 0;
			byte [] byt = new byte[1024];
			long start = System.currentTimeMillis();
			if ((len = bis.read(byt)) != -1) {
				bos.write(byt, 0, len);
			}
			long end = System.currentTimeMillis();
			System.out.println("迈克菲升级程序复制完成，共花费时长：" + (end - start) + "毫秒");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
