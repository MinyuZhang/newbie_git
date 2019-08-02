package cn.zmy.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * finally:被finally控制的语句体一定会执行
 * 注意：如果在执行到finally之前jvm退出了，就不能执行了。System.exit(0);--退出
 * 
 * A:格式
 * 		try...catch...finally...
 * B:用于释放资源，在IO流操作和数据库操作中会见到
 */
public class FinallyDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d = null;
		try {
			// System.out.println(10 / 0);
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			/**将整个JVM中的内容停掉;
			 * System.exit(arg)arg若为非零参数，则表示非正常退出
			 */
//			System.exit(1);
		} finally {
			System.out.println("这里的代码是可以执行的");
		}

		System.out.println(d);
	}
}