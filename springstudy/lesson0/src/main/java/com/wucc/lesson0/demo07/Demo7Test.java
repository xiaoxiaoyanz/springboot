package com.wucc.lesson0.demo07;

import com.wucc.lesson0.demo05.Utils.IOCUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-19 13:52
 */
public class Demo7Test {
	private static String beanXml = "classpath:/com/wucc/lesson0/demo07/bean.xml";
	private static String beanXml01 = "classpath:/com/wucc/lesson0/demo07/bean01.xml";

	@Test
	public void test01(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		SetterPattern.Service bean = applicationContext.getBean(SetterPattern.Service.class);
		System.out.println(bean);

	}


	@Test
	public void test02(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml01);


	}


}
