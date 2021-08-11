package com.yucong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yucong.controller.UserDao;

/**
 *  *项目启动后，会将类（UserService）实例化： UserService userService = new UserService();
 *  userService实例化后放在spring容器里面，可以理解为一块内存空间
 * 
 * @author DELL
 *
 */
@Service
public class UserService {
	
	/**
	 * 会将spring容器里面的userDao取出来，赋值给userDao2
	 */
	@Autowired
	private UserDao userDao2;

	public UserDao getUserDao2() {
		return userDao2;
	}
	public void setUserDao2(UserDao userDao2) {
		this.userDao2 = userDao2;
	}
	
	
	
}
