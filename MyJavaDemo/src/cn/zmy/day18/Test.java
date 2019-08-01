package cn.zmy.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("张敏宇", "23");
		Student s2 = new Student("敏宇张", "24");
		Student s3= new Student("宇敏张", "22");
		Student s4 = new Student("张宇敏", "20");
		Student s5 = new Student("s宇敏", "20");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = Integer.parseInt(o1.getAge()) - Integer.parseInt(o2.getAge());
				num = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num;
			}
		});
		System.out.println(list);
	}
}