package cn.zmy.day13;

import java.util.Arrays;

public class Day13 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Java");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		int arr [] = { 11, 22, 33, 44, 55, 66, 77 };
		int arr2 [] = {1, 1, 1, -1, -1, 0};
		
		int pos = binarySearch(arr, 44);
		int pos2 = binarySearch(arr, 77);
		System.out.println(pos);
		System.out.println(pos2);
		System.out.println(binarySearch(arr2, -1));
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		int arr3[] = Arrays.copyOfRange(arr, 3, 6);//复制指定范围的源数组至目标数组
		System.out.println(Arrays.toString(arr3));
	}

	public static int binarySearch(int arrint[], int num) {
		int max = arrint.length - 1;
		int min = 0;
		int mid = (max + min) / 2;

		// 对一个有序的数组使用二分法查找指定的数
		while (arrint[mid] != num) {
			// 大了，查找范围：min ~ mid
			if (arrint[mid] > num) {
				max = mid - 1;
				// 小了，查找范围：mid ~ max
			} else if (arrint[mid] < num) {
				min = mid + 1;
			}
			if (min > max) {
				return -1;
			}
			mid = (max + min) / 2;
		}
		return mid;
	}
}
