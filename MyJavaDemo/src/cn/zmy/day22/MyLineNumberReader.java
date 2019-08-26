package cn.zmy.day22;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
	private int linenumber = 0;
	private Reader r;
	
	public MyLineNumberReader(Reader r) {
		this.r = r;
	}
	
	public int getLinenumber() {
		return linenumber;
	}

	public void setLinenumber(int linenumber) {
		this.linenumber = linenumber;
	}


	public String readLine() throws IOException {
		int ch = 0;
		StringBuffer sbu = new StringBuffer();
		this.linenumber ++;
		while ((ch = this.r.read()) != -1) {
			
			
			if (ch == '\r') {
				continue;
			}
			if (ch == '\n') {
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
