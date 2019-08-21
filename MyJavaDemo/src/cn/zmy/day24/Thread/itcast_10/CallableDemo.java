package cn.zmy.day24.Thread.itcast_10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {


/*
 * 多线程实现的方式3：
 *  	A:创建一个线程池对象，控制要创建几个线程对象。
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:这种线程池的线程可以执行：
 * 			可以执行Runnable对象或者Callable对象代表的线程
 * 			做一个类实现Runnable接口。
 * 		C:调用如下方法即可
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:我就要结束，可以吗?
 *			可以。
 */
	public static void main(String[] args) {
		// 创建一个线程池对象，声明要控制的线程对象数
		ExecutorService pool = Executors.newFixedThreadPool(2);
		// 两个线程对象
		MyCallable mc1 = new MyCallable(50);
		MyCallable mc2 = new MyCallable(100);
		
		Future<Integer> f1 = pool.submit(mc1);
		Future<Integer> f2 = pool.submit(mc2);
		
		try {
			Integer i1 = f1.get();
			Integer i2 = f2.get();
			System.out.println(i1);
			System.out.println(i2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1);
		System.out.println(f2);
		pool.shutdown();
		// (50 + 1) x 25 = 1275
	}
}
