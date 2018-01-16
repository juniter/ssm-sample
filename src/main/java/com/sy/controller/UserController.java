package com.sy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sy.domain.User;
import com.sy.service.UserService;

/**
 * 
 * <p>Title: UserController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author wyw
 * @date 2018年1月11日 下午6:45:42 
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/user")
	@ResponseBody
	public User user(@RequestParam(value="name") String userName){
		try {
			String username = userName.trim();
			User user = null;
			if (username != null && username != "") {
				user = userService.getUser(username);
				System.out.println(user);
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
