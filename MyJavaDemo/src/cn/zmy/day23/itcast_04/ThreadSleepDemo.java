package cn.zmy.day23.itcast_04;

/*
 *		public static void sleep(long millis)
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		ts1.setName("光头和尚");
		ts2.setName("钢铁直男");
		ts3.setName("陆地装甲");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}
}
