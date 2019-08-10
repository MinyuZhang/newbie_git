package cn.zmy.day23.itcast_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadStop extends Thread {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	@Override
	public void run() {
		System.out.println("beginning" + sdf.format(new Date()));

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("线程意外被中止");
		}

		System.out.println("the end" + sdf.format(new Date()));
	}
}
