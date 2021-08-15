package com.yucong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yucong.pojo.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

	List<User> selectAllV2(@Param("username")String username);
	
}
