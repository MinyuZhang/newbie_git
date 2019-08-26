package cn.zmy.day18;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);

		System.out.println("list:" + list);

		Collections.shuffle(list);//随机切换
		System.out.println("list:" + list);
	}
}
