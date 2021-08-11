package com.yucong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yucong.service.UserService;

/**
 * 
 * @author DELL
 *
 */
@RestController
public class HelloController {

	UserService userService;
	
	@GetMapping("/test")
    public String hello() {
        return "1 Hello Spring Boot !!!!";
    }


}
