package cn.zmy.day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
public class DateDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		System.out.println("d:" + sdf.format(d));

		// long time = System.currentTimeMillis();
		long time = 1000 * 60 * 60; //
		Date d2 = new Date();
		Calendar c = Calendar.getInstance();
		c.set(2019, 7, 15);
		System.out.println("d2:" + sdf.format(c.getTime()));
	}
}
