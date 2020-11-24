package com.wucc.lesson0.demo03;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 14:37
 */
public class BeanScopeModel {
	public BeanScopeModel(String scope) {
		System.out.println(String.format("线程{%s}的scope{%s},this{%s}",Thread.currentThread().getName(),scope,this));
	}
}
