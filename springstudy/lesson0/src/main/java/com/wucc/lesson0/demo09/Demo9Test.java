package com.wucc.lesson0.demo09;

import com.wucc.lesson0.demo05.Utils.IOCUtils;
import com.wucc.lesson0.demo09.model.ServiceB;
import com.wucc.lesson0.demo09.model.ServiceD;
import com.wucc.lesson0.demo09.model.ServiceE;
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
public class Demo9Test {
	private static String beanXml = "classpath:/com/wucc/lesson0/demo09/bean.xml";




	@Test
	public void test01(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);




	}

	@Test
	public void test02(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);

		System.out.println(applicationContext.getBean("serviceB"));
		System.out.println(applicationContext.getBean("serviceC"));




	}


	@Test
	public void test03(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);

		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));

		ServiceB serviceB = applicationContext.getBean(ServiceB.class);

		System.out.println(serviceB.getServcieA());
		System.out.println(serviceB.getServcieA());


	}


	@Test
	public void test04(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);

		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));

		ServiceD serviceD = applicationContext.getBean(ServiceD.class);

		serviceD.say();
		serviceD.say();
		serviceD.say();


	}


	@Test
	public void test05(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);

		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));

		ServiceE serviceE = applicationContext.getBean(ServiceE.class);

		serviceE.say();
		serviceE.say();
		serviceE.say();


	}



	@Test
	public void test06(){

		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);

		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));
		System.out.println(applicationContext.getBean("serviceA"));

		ServiceB Serviceb = (ServiceB)applicationContext.getBean("serviceBRE");

		System.out.println(Serviceb.getServcieA());
		System.out.println(Serviceb.getServcieA());
		System.out.println(Serviceb.getServcieA());


	}

}
