package cn.zmy.day17.dao.impl;

import java.util.ArrayList;

import cn.zmy.day17.dao.UserDao;
import cn.zmy.day17.pojo.User;

public class UserDaoImpl implements UserDao {
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;

		for (User u : array) {
			if (u.getUsername().equals(username)
					&& u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {
		array.add(user);
	}
}
