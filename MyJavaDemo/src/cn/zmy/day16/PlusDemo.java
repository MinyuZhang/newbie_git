package cn.zmy.day16;

public class PlusDemo {
	public static void main(String[] args) {
		/**
		 * 递归
		 * 1 + 2 + ... + 99
		 */
		plus(0, 1, 99);
	}
	public static void plus(int sum, int i, int j) {
		if (i <= j) {
			sum += i;
			i ++;
			plus(sum, i, j);
		} else {
			System.out.println(sum);
		}
	}
}
