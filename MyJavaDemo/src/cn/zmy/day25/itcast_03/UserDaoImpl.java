package cn.zmy.day25.itcast_03;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void delete() {
		System.out.println("delete");
	}

	@Override
	public void modify() {
		System.out.println("modify");
	}

	@Override
	public void query() {
		System.out.println("query");
	}

}
