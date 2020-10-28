package com.wucc.demo.service.impl;

import com.wucc.demo.domain.User;
import com.wucc.demo.mapper.UserMapper;
import com.wucc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	 private UserMapper userMapper;
	 
	@Override
	public int add(User user) {
		userMapper.insert(user);
		int id = user.getId();
		return id;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int addAccount() {
		User user = new User();
		user.setAge(88);
		user.setCreateTime(new Date());
		user.setName("测试事务啦加入事务");
		user.setPhone("10010101010");
		userMapper.insert(user);
		int i = 19/0;
		
		return 0;
	}
	
	
	

	
	
}
