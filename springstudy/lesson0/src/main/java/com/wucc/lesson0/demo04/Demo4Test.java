package com.wucc.lesson0.demo04;

import com.wucc.lesson0.demo04.Utils.IOCUtils;
import com.wucc.lesson0.demo04.model.CardModel;
import com.wucc.lesson0.demo04.model.UserModel;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 15:21
 */
public class Demo4Test {
	private  static String beanXml = "classpath:/com/wucc/lesson0/demo04/bean.xml";

	@Test
	public void test01(){
		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		UserModel userModel =(UserModel) applicationContext.getBean("UserModel");
		System.out.println(userModel);

	}

	@Test
	public void test02(){
		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		CardModel cardModel =(CardModel) applicationContext.getBean("CardModel");
		System.out.println(cardModel);

	}

	@Test
	public void test03(){
		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		System.out.println(applicationContext.getBean("MenuModel"));

	}

	@Test
	public void test04(){
		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		System.out.println(applicationContext.getBean("OrderModel01"));
		System.out.println(applicationContext.getBean("OrderModel02"));
		System.out.println(applicationContext.getBean("OrderModel03"));

	}

	@Test
	public void test05(){
		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		System.out.println(applicationContext.getBean("CollectionModel"));


	}







}
