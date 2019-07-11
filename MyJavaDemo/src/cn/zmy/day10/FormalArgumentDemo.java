package cn.zmy.day10;

interface Interest{
	public void love();
}
class InterestDemo{
	public void method(Interest i) {
		i.love();
	}
	public Teacher getTeacher() {
		return new Teacher();
	}
}
class Teacher implements Interest{
	@Override
	public void love() {
		System.out.println("老师喜欢教学生知识");
	}
	public void say() {
		System.out.println("老师向大家问好");
	}
}
public class FormalArgumentDemo {
	public static void main(String[] args) {
		InterestDemo id = new InterestDemo();
		Interest i = new Teacher();
		id.method(i);
		
		//链式编程
		id.getTeacher().say();
	}
}
