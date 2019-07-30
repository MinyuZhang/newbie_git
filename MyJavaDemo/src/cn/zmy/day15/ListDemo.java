package cn.zmy.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Random rand = new Random();
		int num = 0;
		while(true) {
			if (list.size() >= 10) {
				break;
			}
			num = rand.nextInt(20) + 1;
			if (!list.contains(String.valueOf(num))) {
				list.add(String.valueOf(num));
			}
		}
		list = bubbleSort(list);
		System.out.println(list);
	}
	/**
	 * 集合冒泡排序
	 * @param list
	 */
	public static List<String> bubbleSort(List<String> list) {
		String []arr = (String[])list.toArray(new String[list.size()]);
		String str= "";
		for (int i = 1; i < arr.length; i ++) {
			for (int j = 0; j < arr.length - i; j ++) {
				if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j + 1])) {
					str = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = str;
				}
			}
		}
		return Arrays.asList(arr); 
	}
}
