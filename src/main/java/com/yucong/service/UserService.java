package com.yucong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yucong.mapper.UserMapper;
import com.yucong.pojo.entity.User;

/**
 * 项目启动后，会将类（UserService）实例化： UserService userService = new UserService();
 *  userService实例化后放在spring容器里面，可以理解为一块内存空间
 */
@Service
public class UserService {
	
	/**
	 * 会将spring容器里面的userMapper取出来，赋值给userMapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * 添加用户
	 */
	public User add(User user) {
		userMapper.insertSelective(user);
		return user;
	}

	/**
	 * 查询所有用户
	 */
	public List<User> findAll() {
		return userMapper.selectAll();
	}

	/**
	 * @param username
	 * @param page
	 * @param size
	 * @return
	 */
	public List<User> findAllV2(String username,Integer page,Integer size) {
		PageHelper.startPage(page, size);
		List<User> list = userMapper.selectAllV2( "%" + username + "%");
		return list;
	}
	
}
