package cn.zmy.day05;

public class Array {
	private static int [] arr1 = new int[6];//初始化一个长度为3的int类型数组默认值为0
	private int [] getArray() {
		return arr1;
	}
	//打印出数组中的每个数: [a1, a2, ... , ]
	public void printIntArray(int [] arr) {
		String str = "";
		str = str.concat("[");
		for (int i = 0; i < arr.length; i ++) {
			if (i == arr.length-1) {
				str = str.concat(arr[i] + "]");
			} else {
				str = str.concat(arr[i] + ", ");
			}
		}
		System.out.println(str);
	}
	//求数组中的最大值
	public void printMaximum(int [] arr) {
		int maximum = arr[0];
		for (int start = 0; start <arr.length; start ++) {
			if (maximum < arr[start]) {
				maximum = arr[start];
			}
		}
		System.out.println("数组中最大的数是" +maximum);
	}
	//逆序
	public void reverseArray(int [] arr) {
		int temp = 0;
		for (int start = 0, end = arr.length-1; start <= end; start ++, end --) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	//基本查找 | 在给定数组中查找给定数据,若有,返回其在数组中的位置,若无,返回-1
	public int getIndex(int [] arr, int value) {
		int index = -1;
		for (int pos = 0; pos < arr.length; pos ++) {
			if (arr[pos] == value) {
				index = pos;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Array array = new Array();
		int [] arr = array.getArray();
//		System.out.println(arr[0]);
		arr1[0] = 25;
		arr1[1] = 26;
		arr1[2] = 27;
		arr1[3] = 15;
		arr1[4] = 25;
		arr1[5] = -10;
		array.printMaximum(arr1);
		
		array.printIntArray(arr1);//输出逆序前的数组
		array.reverseArray(arr1);//逆序
		array.printIntArray(arr1);//输出逆序后的数组
		int index = array.getIndex(arr1, -10);
		System.out.println(index);
	}
}
