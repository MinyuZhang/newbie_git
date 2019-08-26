package cn.zmy.day23.itcast_04;

/*
 * public final void join():等待该线程终止。 
 */
public class ThreadJoinDemo {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		tj1.setName("贝多芬");
		tj2.setName("莫扎特");
		tj3.setName("维也纳");

		tj1.start();
		try {
			tj1.join();// 等待该线程终止
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tj2.start();
		tj3.start();
	}
}
