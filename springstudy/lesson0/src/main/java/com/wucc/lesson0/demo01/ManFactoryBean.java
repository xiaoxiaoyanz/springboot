package com.wucc.lesson0.demo01;

import org.springframework.beans.factory.FactoryBean;


/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-11 09:57
 */
public class ManFactoryBean implements FactoryBean<Man> {
	int count = 0;
	@Override
	public Man getObject() throws Exception {
		Man man = new Man(++count+"个bean对象",80);
		return man;
	}

	@Override
	public Class<?> getObjectType() {
		return Man.class;
	}
	@Override
	public boolean isSingleton(){
		return false;
	}
}
