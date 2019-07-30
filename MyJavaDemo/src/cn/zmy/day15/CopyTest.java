package cn.zmy.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("The Spectre");
		list.add("Faded");
		list.add("Sing Me To Sleep");
		List<String> list_copy = new ArrayList<String>(Arrays.asList(new String[list.size()]));
		Collections.copy(list_copy, list);
//		list_copy.addAll(list);
		list.add("AlanWalker");
		list_copy.add("Insomnia");
		System.out.println(list_copy);
		System.out.println(list);
		System.out.println("-------------");
		/**
		 * 在33后面添加“88”
		 */
		int[] arr1 = { 11, 22, 33, 44, 55 };
		int[] arr2 = new int[6];
//		for (int i : arr1) {
//			System.out.print(i + "\n");
//		}
//		for (int i : arr2) {
//			System.out.println(i);
//		}
		for (int i = 0; i < arr1.length; i ++) {
			if (33 == arr1[i]) {
				System.arraycopy(arr1, 0, arr2, 0, i + 1);
				arr2[i + 1] = 88;
				System.arraycopy(arr1, i + 1, arr2, i + 2, 2);
			}
		}
//		System.arraycopy(arr1, 0, arr2, 0, 3);
//		arr2[3] = 88;
//		System.arraycopy(arr1, 3, arr2, 4, 2);
		for (int i : arr2) {
			System.out.println(i);
		}
	}
}
