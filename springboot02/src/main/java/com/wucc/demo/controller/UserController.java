package com.wucc.demo.controller;


import com.wucc.demo.domain.JsonData;
import com.wucc.demo.domain.User;
import com.wucc.demo.mapper.UserMapper;
import com.wucc.demo.service.UserService;
import com.wucc.demo.task.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

/**
 *@作者 小D课堂  小D
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserMapper userMapper;
	
	
	/**
	 * 功能描述: user 保存接口
	 * @return
	 */
	@GetMapping("add")
	public Object add(){
		
		User user = new User();
		user.setAge(11);
		user.setCreateTime(new Date());
		user.setName("xdclass");
		user.setPhone("10010000");
		int id = userService.add(user);
		
       return JsonData.buildSuccess(id);
	}
	
	
	
	/**
	 * 功能描述：查找全部用户
	 * @return
	 */
	@GetMapping("findAll")
	public Object findAll(){
		
       return JsonData.buildSuccess(userMapper.getAll());
	}
	
	
	
	@GetMapping("find_by_id")
	public Object findById(long id){
       return JsonData.buildSuccess(userMapper.findById(id));
	}
	
	
	@GetMapping("del_by_id")
	public Object delById(long id){
	userMapper.delete(id);
       return JsonData.buildSuccess();
	}
	
	@GetMapping("update")
	public Object update(String name,int id){
		User user = new User();
		user.setName(name);
		user.setId(id);
		userMapper.update(user);
	    return JsonData.buildSuccess();
	}
	
	
	
	
	
	
	//测试事务
	@GetMapping("add_account")
	public Object addAccount(){
		int id = userService.addAccount();
	    return JsonData.buildSuccess(id);
	}


	@Autowired
	private AsyncTask task;

	@GetMapping("async_task")
	public JsonData exeTask() throws InterruptedException{

		long begin = System.currentTimeMillis();

//		task.task1();
//		task.task2();
//		task.task3();

		Future<String> task4 = task.task4();
		Future<String> task5 = task.task5();
		Future<String> task6 = task.task6();
		for(;;){
			if (task4.isDone() && task5.isDone() && task6.isDone()) {
				break;
			}
		}


		long end = System.currentTimeMillis();

		long total = end-begin;
		System.out.println("执行总耗时="+total);
		return JsonData.buildSuccess(total);
	}


	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@GetMapping("log")
	public Object testLog(){

		logger.debug("this is debug level");
		logger.info("this is info level ");
		logger.warn("this is warn level ");
		logger.error("this is error level");
		return JsonData.buildSuccess();
	}
	
	
	
}
