package cn.zmy.day06;

public class ObjectOrientation {
	//二维数组求和
	public static void sumArray(int [][]arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[i].length; j ++) {
				sum += arr[i][j];
			}
		}
		System.out.println("该二维数组的和为：" + sum);
	}
	public static void main(String[] args) {
		int a = 10, b = 20;
		int[] arr = new int[] {1, 2, 3, 47, 5};
		a = b;
		System.out.println(a + " | " + b);
		ObjectOrientation.change(arr);
		
		/**
		 * 如何定义二维数组?
		 *  A:数据类型[][] 数组名 = new 数据类型[m][n];
			B:数据类型[][] 数组名 = new 数据类型[m][];
			C:数据类型[][] 数组名 = new 数据类型[][]{{...},{...},{...}};
			D:数据类型[][] 数组名 = {{...},{...},{...}};
		 */
		int [][] arr2 = new int[][] {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		ObjectOrientation.sumArray(arr2);
	}
	//将arr[1]、arr[3]、arr[5]、……乘以二
	public static void change(int [] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i ++) {
			if (i % 2 != 0) {
				arr[i] *= 2;
			}
			if (i == arr.length-1) {
				str = str.concat(String.valueOf(arr[i]) + "]");
			} else {
				str = str.concat(String.valueOf(arr[i]) + ", ");
			}
		}
		System.out.println(str);
	}
}
