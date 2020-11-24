package com.wucc.lesson0.demo09.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 10:47
 */
public class ServiceD implements ApplicationContextAware {

   public void say(){
   	    ServcieA servcieA = this.getServiceA();
	   System.out.println(this+"====>>>>"+servcieA);

   }

	public ServcieA getServiceA(){
		return this.context.getBean(ServcieA.class);
	}


	private ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}
}
