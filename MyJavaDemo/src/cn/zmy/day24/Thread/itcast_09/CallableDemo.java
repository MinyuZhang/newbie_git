package cn.zmy.day24.Thread.itcast_09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new MyCallable());
		es.submit(new MyCallable());
		es.shutdown();
	}
}
