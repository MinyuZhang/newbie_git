package cn.zmy.day22;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	public String readLine() throws IOException {
		StringBuffer sbu = new StringBuffer();
		
		int ch = 0;
		while((ch = this.r.read()) != -1) {
			if (ch == '\r') {// 回车
				continue;
			}
			if (ch == '\n') {// 换行--说明一行读完了
				return sbu.toString();
			} else {
				sbu.append((char)ch);
			}
		}
		if (sbu.length() > 0) {
			return sbu.toString();
		}
		return null;
	}

	public void close() throws IOException {
		this.r.close();
	}
	
}
