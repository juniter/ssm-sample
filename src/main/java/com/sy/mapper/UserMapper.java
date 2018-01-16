package com.sy.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sy.domain.User;

public interface UserMapper {
	/**
	 * 获取用户
	 * @return
	 */
	User selectUser(String username);
}
