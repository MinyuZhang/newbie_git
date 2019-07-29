package cn.zmy.day14;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.getClass().getSimpleName());

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date = rightNow.get(Calendar.DATE);
		/*
		 * 1-周日 2-周一……7-周六
		 */
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));// 6
		/*
		 * 目标日期在当月所在的周数
		 */
		System.err.println(rightNow.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		System.out.println(year + " | " + (month + 1) + " | " + date);
	}
}
