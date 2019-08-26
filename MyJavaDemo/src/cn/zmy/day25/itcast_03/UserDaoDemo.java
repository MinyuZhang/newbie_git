package cn.zmy.day25.itcast_03;

/*
 * 问题：
 * 		接口(方法比较多) -- 实现类(仅仅使用一个，也得把其他的实现给提供了，哪怕是空实现)
 * 		太麻烦了。
 * 解决方案：
 * 		接口(方法比较多) -- 适配器类(实现接口,仅仅空实现) -- 实现类(用哪个重写哪个)
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}
}
