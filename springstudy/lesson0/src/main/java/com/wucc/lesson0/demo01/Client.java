package com.wucc.lesson0.demo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-10 17:01
 */
public class Client {

	public static void main(String[] args) {
		//1.bean配置文件位置
		String beanXml = "classpath:/com/wucc/lesson0/demo01/bean.xml";
		//2.创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXml);
		//3.从容器中获取需要的bean
		HelloWorld helloWorld = context.getBean("helloworld", HelloWorld.class);
		//4.使用对象
		helloWorld.say();

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName+" "+context.getBean(beanDefinitionName));
		}

		System.out.println("manFactoryBean:"+context.getBean("manFactoryBean"));
		System.out.println("manFactoryBean:"+context.getBean("manFactoryBean"));
		System.out.println("manFactoryBean:"+context.getBean("manFactoryBean"));
		System.out.println("manFactoryBean:"+context.getBean("manFactoryBean"));
	}
}
