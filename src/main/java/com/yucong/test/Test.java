package com.yucong.test;

import com.alibaba.fastjson.JSON;
import com.yucong.pojo.entity.User;

public class Test {

	public static void main(String[] args) {
		
		String json = "{\"password\":\"yuyang2\",\"username\":\"yuyang2\",\"nickName\":\"yuyang2\"}";
		User user = JSON.parseObject(json, User.class);
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		
	}
	
}
