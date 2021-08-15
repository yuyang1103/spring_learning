package com.yucong.controller;

public class Test {

	public void query() {
		
		// 连接数据库
		conn();
		
		// 写sql数据
		writeSql();
		
		// 执行数据库命令
		doJob();
		
		// 释放数据库连接
		destroy();
	}

	private void destroy() {
		// .....
		
	}

	private void doJob() {
		// .....
		
	}

	private void writeSql() {
		String sql = "select * from user";
	}

	private void conn() {
		// .....
		
	}
	
	
}
