package cn.zmy.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
	/**
	 *  键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Please enter a series of numbers: ");
		while (true) {
			Integer i = s.nextInt();
			if (i == 0) {
				s.close();
				break;
			}
			list.add(i);
		}
		//冒泡排序
		bubbleSort(list);
	}
	public static void bubbleSort(List<Integer> list) {
		Integer []obj = list.toArray(new Integer[] {});
		int temp = 0;
		for (int i = 0; i < obj.length - 1; i ++) {
			for (int j = i; j < obj.length; j ++) {
				if (obj[i] > obj[j]) {
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
			}
		}
		System.out.println(Arrays.asList(obj));
	}
}
