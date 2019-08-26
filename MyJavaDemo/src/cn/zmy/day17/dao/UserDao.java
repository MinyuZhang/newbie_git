package cn.zmy.day17.dao;

import cn.zmy.day17.pojo.User;

public interface UserDao {
	public abstract boolean isLogin(String username, String password);

	public abstract void regist(User user);
}
