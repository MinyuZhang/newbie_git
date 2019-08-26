package cn.zmy.day18;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<Student, String>();

		Student s1 = new Student("貂蝉", Integer.toString(27));
		Student s2 = new Student("王昭君", Integer.toString(28));
		Student s3 = new Student("西施", Integer.toString(33));
		Student s4 = new Student("杨玉环", Integer.toString(35));
		Student s5 = new Student("貂蝉", Integer.toString(20));

		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");

		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}
}