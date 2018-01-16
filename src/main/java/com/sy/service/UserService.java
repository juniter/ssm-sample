package com.sy.service;

import com.sy.domain.User;
/**
 * 用户Service
 * <p>Title: UserService</p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author wyw
 * @date 2018年1月11日 下午4:24:04 
 *
 */
public interface UserService {
	/**
	 * 获取用户信息
	 * @param username
	 * @return
	 */
	User getUser(String username);
}
