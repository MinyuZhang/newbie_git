package cn.zmy.day23.itcast_04;

/*
 * public static void yield():暂停当前正在执行的线程对象，并执行其他线程。 
 * 让多个线程的执行更和谐，但是不能靠它保证一人一次。
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		ty1.setName("镭射鼠标");
		ty2.setName("樱桃轴");
		ty1.start();
		ty2.start();
	}
}
