package com.wucc.demo.service;


import com.wucc.demo.domain.User;

public interface UserService {

	public int add(User user);
	
	
	
	/**
	 * 功能描述：测试事务
	 * @return
	 */
	public int addAccount();
	
}
