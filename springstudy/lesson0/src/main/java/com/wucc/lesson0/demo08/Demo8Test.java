package com.wucc.lesson0.demo08;

import com.wucc.lesson0.demo05.Utils.IOCUtils;
import com.wucc.lesson0.demo07.SetterPattern;
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
public class Demo8Test {
	private static String beanXml = "classpath:/com/wucc/lesson0/demo08/bean.xml";




	@Test
	public void test01(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);
		System.out.println("======================================");
		applicationContext.getBean("lazyBean");



	}

	@Test
	public void test02(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);




	}

}
