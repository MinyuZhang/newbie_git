package cn.zmy.day09;

public class Day09 {
	public static void main(String[] args) {
		JumpCat jc = new JumpCat();
		jc.jump();
		jc.setName("加菲猫");
		jc.setAge(3);
		System.out.println(jc.getName());
		System.out.println(jc.getAge());
		System.out.println(jc.toString());
	}
}
