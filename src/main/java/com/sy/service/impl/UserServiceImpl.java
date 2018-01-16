package com.sy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.mapper.UserMapper;
import com.sy.domain.User;
import com.sy.service.UserService;
/**
 * 
 * <p>Title: UserServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author wyw
 * @date 2018年1月12日 上午9:01:22 
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 获取用户
	 */
	@Override
	public User getUser(String username) {
		User user = userMapper.selectUser(username);
		return user;
	}

}
