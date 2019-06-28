package cn.zmy.Day03;

public class Operators2 {
	public static void main(String[] args) {
		/**
		 * &:如果左边错误,右边仍然会执行
		 * x = 2, y = 1
		 */
		int x = 1, y = 1, a = 1, b = 1;
		if (x ++ ==2 & ++ y == 2) {
			x = 7;
		}
		/**
		 * &&:如果左边错误,右边不会执行--短路效果
		 */
		if (a ++ ==2 && ++ b == 2 ) {
			a = 7;
		}
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("a = " + a + ", b = " + b);
		
		int x1 = 1, y1 = 1, a1 = 1, b1 = 1;
		if (x1 ++ ==2 | ++ y1 == 2) {
			x1 = 7;
		}
		if (a1 ++ ==2 || ++ b1 == 2) {
			a1 = 7;
		}
		System.out.println("x1 = " + x1 + ", y1 = " + y1);
		System.out.println("a1 = " + a1 + ", b1 = " + b1);
	}
}
