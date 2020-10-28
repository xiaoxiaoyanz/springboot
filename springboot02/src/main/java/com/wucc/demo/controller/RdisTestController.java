package com.wucc.demo.controller;

import com.wucc.demo.domain.JsonData;
import com.wucc.demo.domain.User;
import com.wucc.demo.utils.JsonUtils;
import com.wucc.demo.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/api/v1/redis")
public class RdisTestController {

	
	@Autowired
	private StringRedisTemplate redisTpl; //jdbcTemplate

	@Autowired
	private RedisClient redis;
	
	@GetMapping(value="add")
	public Object add(){
		 
		//redisTpl.opsForValue().set("name", "xdclass2018");
		redis.set("username", "xddddddd");
		return JsonData.buildSuccess();
		
	}
	
	@GetMapping(value="get")
	public Object get(){
		
		//String value = redisTpl.opsForValue().get("name");
		String value = redis.get("username");
		return JsonData.buildSuccess(value);
		
	}
	

	@GetMapping(value="save_user")
	public Object saveUser(){
		User user = new User(1, "abcd", "11",23, new Date());
		String userStr = JsonUtils.obj2String(user);
		boolean flag = redis.set("base:user:11", userStr);
		return JsonData.buildSuccess(flag);
		
	}
	
	@GetMapping(value="find_user")
	public Object findUser(){

		String userStr = redis.get("base:user:11");
		User user = JsonUtils.string2Obj(userStr, User.class);
		
		return JsonData.buildSuccess(user);
		
	}
	
	
}
