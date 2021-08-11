package com.yucong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @Component
 * 项目启动后，会将UserDao实例化： UserDao userDao = new UserDao();
 *  userDao实例化后放在spring容器里面，可以理解为一块内存空间
 *
 */
@Component
public class UserDao {

	public List<User> getUsers() {
		List<User> users = findFromMySql();
		return users;
	}

	// 模仿jdbc查询数据：select * from t_user
	private List<User> findFromMySql() {
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new User());
		users.add(new User());
		return users;
	}
	
}
