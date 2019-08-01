package cn.zmy.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class PokerDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> poker = new HashMap<Integer, String>();
		List<Integer> arr = new ArrayList<Integer>();
		String []pattern = {"♠", "♥", "♦", "♣"};
		String []number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q" ,"K"};
		
		//装牌
		int index = 0;
		for (String p : pattern) {
			for (String n : number) {
				poker.put(index, p.concat(n));
				arr.add(index);
				index ++;
			}
		}
		poker.put(index, "小王");
		arr.add(index);
		index ++;
		poker.put(index, "大王");
		arr.add(index);
		System.out.println(poker);
		
		//洗牌
		Collections.shuffle(arr);
//		System.out.println(Collections.max(arr));
		
		TreeSet<Integer> xm = new TreeSet<Integer>();
		TreeSet<Integer> xf = new TreeSet<Integer>();
		TreeSet<Integer> xh = new TreeSet<Integer>();
		
		//发牌
		for (int i = 0; i < poker.size() - 2; i += 3) {
			xm.add(arr.get(i));
			xf.add(arr.get(i + 1));
			xh.add(arr.get(i + 2));
		}
//		System.out.println(xm);
//		System.out.println(xf);
//		System.out.println(xh);
		checkPoker("xm", xm, poker);
		checkPoker("xf", xf, poker);
		checkPoker("xh", xh, poker);
	}
	
	public static void checkPoker(String name, TreeSet<Integer> set, Map<Integer, String> map) {
		String str = "[";
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			str = str.concat(map.get(it.next()) + ", ");
		}
		str = str.concat("]").replace(", ]", "]");
		System.out.println(name + "的牌为：" + str);
	}
}
