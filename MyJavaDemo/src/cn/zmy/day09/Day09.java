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

		Animal animal = new Cat();
		/**
		 * 父类不能引用子类特有的方法，
		 * 向下转型
		 */
		Cat a = (Cat)animal;
		a.say();
		animal.sleep();
	}
}
