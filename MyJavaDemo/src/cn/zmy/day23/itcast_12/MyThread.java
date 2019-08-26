package cn.zmy.day23.itcast_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyThread implements Runnable {
	private static List<String> list = new ArrayList<String>();
	static {
		list = Collections.synchronizedList(list);
		list.add(generateRandomLetters());
		list.add(generateRandomLetters());
		list.add(generateRandomLetters());
		list.add(generateRandomLetters());
		list.add(generateRandomLetters());
	}

	@Override
	public void run() {
		System.err.println(list);
		synchronized (list) {
			Iterator<String> i = list.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
	}

	public static String generateRandomLetters() {
		String[] string = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
		Random rand = new Random();

		return string[rand.nextInt(10)];// [0, 10]
	}

	public static void main(String[] args) {
//		System.out.println(list);
	}

}
