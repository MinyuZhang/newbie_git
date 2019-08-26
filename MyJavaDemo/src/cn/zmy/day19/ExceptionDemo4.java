package cn.zmy.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2019-08-01";
		try {
			Date d = sdf.parse(str);
			String str2 = sdf.format(Calendar.getInstance().getTime());
			System.out.println(str2);
//			System.out.println(sdf.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("日期编译异常");
		}
	}
}
