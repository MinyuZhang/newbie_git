package cn.zmy.day18;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * LinkedHashMap:是Map接口的哈希表和链接列表实现，具有可预知的迭代顺序。 由哈希表保证键的唯一性
 * 由链表保证键键值的有序(存储和取出的顺序一致)
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		
		// 创建并添加元素
		hm.put("2345", "hello");
		hm.put("1234", "world");
		hm.put("3456", "java");
		hm.put("6666", "javaee");
		hm.put("7777", "android");
//		hm.remove("2345");
		// 遍历
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
