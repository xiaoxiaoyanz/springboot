package com.wucc.lesson0.demo09.model;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 10:59
 */
public class ServiceE {

	public void say(){
		ServcieA serviceA = this.getServiceA();
		System.out.println(this+"=>"+serviceA);
	}

	public ServcieA getServiceA() {
		return  null;
	}
}
