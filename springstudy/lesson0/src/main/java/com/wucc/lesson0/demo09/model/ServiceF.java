package com.wucc.lesson0.demo09.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 11:07
 */
public class ServiceF implements MethodReplacer, ApplicationContextAware {
	@Override
	public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
		return this.context.getBean(ServcieA.class);
	}
    private ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;

	}
}
