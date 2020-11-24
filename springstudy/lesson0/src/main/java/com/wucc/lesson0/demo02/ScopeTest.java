package com.wucc.lesson0.demo02;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-11 10:32
 */
public class ScopeTest {
	ClassPathXmlApplicationContext applicationContext;

	@Before
	public void before(){
		System.out.println("容器准备启动");
		String beanXml = "classpath:/com/wucc/lesson0/demo02/bean.xml";
		this.applicationContext = new ClassPathXmlApplicationContext(beanXml);
		System.out.println("容器启动完毕");

	}
	@Test
	public void scopeTest(){
		System.out.println("单例bean");
		System.out.println(applicationContext.getBean("scopeTest"));
		System.out.println(applicationContext.getBean("scopeTest"));
		System.out.println(applicationContext.getBean("scopeTest"));
	}

	@Test
	public void protoType(){
		System.out.println("多例bean");
		System.out.println(applicationContext.getBean("protoType"));
		System.out.println(applicationContext.getBean("protoType"));
		System.out.println(applicationContext.getBean("protoType"));
	}

}
