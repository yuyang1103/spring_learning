package com.yucong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yucong.controller.UserDao;

@Service
public class StudentService {

	/**
	 * 会将spring容器里面的userDao取出来，赋值给userDao3
	 */
	@Autowired
	private UserDao userDao3;

	public UserDao getUserDao3() {
		return userDao3;
	}
	public void setUserDao3(UserDao userDao3) {
		this.userDao3 = userDao3;
	}
	
	
	
}
