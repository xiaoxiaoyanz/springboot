package com.wucc.lesson0.demo05;

import com.wucc.lesson0.demo05.Utils.IOCUtils;
import com.wucc.lesson0.demo05.model.CardModel;
import com.wucc.lesson0.demo05.model.UserModel;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;

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


	@Test
	public void test06(){
		System.out.println(Object.class.isAssignableFrom(Integer.class)); //true
		System.out.println(Object.class.isAssignableFrom(int.class)); //false
		System.out.println(Object.class.isAssignableFrom(List.class)); //true
		System.out.println(Collection.class.isAssignableFrom(List.class)); //true
		System.out.println(List.class.isAssignableFrom(Collection.class)); //false


	}










}
