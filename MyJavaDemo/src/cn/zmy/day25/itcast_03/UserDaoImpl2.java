package cn.zmy.day25.itcast_03;

public class UserDaoImpl2 extends UserDaoAdapter {

	@Override
	public void add() {
		System.out.println("继承适配器实现添加功能");
	}

}
