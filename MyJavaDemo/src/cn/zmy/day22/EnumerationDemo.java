package cn.zmy.day22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Enumeration<String> en = null;
		Vector<String> vector = new Vector<String>();
		vector.add("Chinese");
		vector.add("Indonesia");
		vector.add("Bolivia");
		vector.add("America");
		vector.add("British");
		vector.add("France");
		en = vector.elements();
		String []arr = vector.toArray(new String[] {});
		Collections.sort(Arrays.asList(arr), new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		vector.clear();
		for (String string : arr) {
			vector.add(string);
		}
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
