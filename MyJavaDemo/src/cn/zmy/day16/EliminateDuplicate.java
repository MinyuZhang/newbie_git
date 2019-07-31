package cn.zmy.day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EliminateDuplicate {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("China");
		list1.add("England");
		list1.add("China");
		list1.add("America");
		list1.add("England");
		list1.add("Casablanca");
		list1.add("Chicago");
		list1.add("Casablanca");
		list1.add("Russia");
		list1.add("Russia");
		list1.add("Mexico");
		
		System.out.println("list1去重前：" + list1);
		System.out.println("去重开始");
		
		/**
		 * 通过冒泡排序，将重复元素抹去
		 */
		for (int i = 0; i < list1.size() - 1; i ++) {
			
			for (int j = i; j < list1.size() - 1; j ++) {
				if (list1.get(i) == list1.get(j + 1)) {
					list1.remove(i);
				}
			}
		}
		
		System.out.println("去重结束");
		System.out.println("list1去重后：" + list1);
		
		System.out.println("--------------------------");
		Employee e1 = new Employee("Karl", "001", "342901199601084219");
		Employee e2 = new Employee("Karl", "001", "342901199601084219");
		Employee e3 = new Employee("Tom", "002", "34290119960108421x");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println(emp);
	}
}
