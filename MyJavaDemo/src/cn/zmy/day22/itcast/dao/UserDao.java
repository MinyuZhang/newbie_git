package cn.zmy.day22.itcast.dao;

import java.io.IOException;

import cn.zmy.day22.itcast.pojo.User;

public abstract class UserDao {
	public abstract boolean login(String username, String password) throws IOException;
	public abstract void registe(User user) throws IOException;
}
