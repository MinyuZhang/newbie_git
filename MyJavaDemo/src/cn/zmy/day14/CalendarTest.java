package cn.zmy.day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter: ");
		int year = sc.nextInt();

		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
//		System.out.println(sdf.format(c.getTime()));
		c.add(Calendar.DATE, -1);//日期减少一天
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.DATE));
		sc.close();
	}
}
