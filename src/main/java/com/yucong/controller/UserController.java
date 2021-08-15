package com.yucong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yucong.pojo.entity.User;
import com.yucong.service.UserService;

/**
 * RestController = @Controller + @ResponseBody
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 添加一个用户
	 */
	@PostMapping("add")
	public User add(@RequestBody User user) {
		User u = userService.add(user);
		return u;
	}
	
	/**
	 * 查询所有用户
	 */
	@GetMapping("list")
	public List<User> list() {
		List<User> list = userService.findAll();
		return list;
	}
	
	/**
	 * 查询所有用户
	 */
	@GetMapping("list/v2")
	public List<User> listV2(@RequestParam(name = "username",defaultValue = "" )String username,
			@RequestParam(name = "page",defaultValue = "1" )Integer page,
			@RequestParam(name = "size",defaultValue = "10" )Integer size) {
		List<User> list = userService.findAllV2(username,page,size);
		return list;
	}
	
	
	
	
}
