package com.yucong.pojo.entity;

import javax.persistence.Table;

@Table(name = "sys_user")
public class User {

	/**用户ID*/
	private Integer id;
	/**用户名*/
	private String username;
	/**密码*/
	private String password;
	
	/**备用字段：salt*/
	private String salt;
	/**备用字段*/
	private Integer roleIds;
	/**备用字段*/
	private Integer locked;
	/**备用字段：组织ID*/
	private String organizationId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Integer getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(Integer roleIds) {
		this.roleIds = roleIds;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	
	
	
	
}
