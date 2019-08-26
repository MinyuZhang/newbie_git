package cn.zmy.day14;

public class SystemDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 200; i ++) {
			System.out.println(i);
			if (i == 190) {
				System.exit(0);// 终止程序
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("The program execuation cost: " + (end - start) +" milliseconds.");
	}
}
