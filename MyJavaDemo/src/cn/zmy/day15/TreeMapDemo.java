package cn.zmy.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		//
		Map<String, Integer> tree_map = new TreeMap<String, Integer>();
		tree_map.put("China", 85);
		tree_map.put("British", 77);
		tree_map.put("American", 100);
		tree_map.put("glass", 110);
		tree_map.put("000", 55);
		tree_map.put("张敏宇", 97);
//		tree_map.put("glass", 111222);
		
		Set<Entry<String, Integer>> entry_set = tree_map.entrySet();
		for (Entry<String, Integer> item : entry_set) {
			System.out.println(item.getKey() + " | " + item.getValue());
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(tree_map.entrySet());
		/**
		 * 自定义比较器，根据map的value值大小升序排序
		 */
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}

		});
		System.out.println(list);
	}

}
