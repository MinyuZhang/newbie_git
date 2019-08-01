package cn.zmy.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountStr {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String str = "aaaabajfijeajfliaskfjaeigjkajsjfiajfiejpfjqpjgijajlfj";
//		String str = "abcddd";
		String []arr = str.split("");
		StringBuffer arr_ = new StringBuffer();

		for (int i = 0; i < arr.length; i ++) {
			if (arr_.indexOf(arr[i]) == -1) {
				arr_.append(arr[i]);
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		System.out.println(map);
	}
}
