package com.wucc.lesson0.demo02;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-11 10:28
 */
public class BeanScopeModel {
	public BeanScopeModel(String beanScope){
		System.out.println(String.format("create BeanScopeModel:{scope=%s},{this=%s}",beanScope,this));
	}
}
