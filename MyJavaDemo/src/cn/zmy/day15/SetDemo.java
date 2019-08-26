package cn.zmy.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Chinese");
		set.add("English");
		set.add("Chinese");
		set.add("Math");
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println("-------------------");
		//迭代器实现遍历
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
