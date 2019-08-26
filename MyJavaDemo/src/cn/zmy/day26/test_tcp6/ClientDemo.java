package cn.zmy.day26.test_tcp6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 		这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 * 
 * 连接被拒绝。TCP协议一定要先看服务器。
 * java.net.ConnectException: Connection refused: connect
 */
public class ClientDemo {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("192.200.25.139", 24);
			OutputStream os = s.getOutputStream();
			os.write("Hello Tcp, 我来了".getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
