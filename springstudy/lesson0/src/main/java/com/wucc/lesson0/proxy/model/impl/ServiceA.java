package com.wucc.lesson0.proxy.model.impl;

import com.wucc.lesson0.proxy.model.Iservice;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 11:21
 */
public class ServiceA implements Iservice {
	@Override
	public void m1() {
		System.out.println("Am1");
	}

	@Override
	public void m2() {
		System.out.println("Am2");

	}

	@Override
	public void m3() {

		System.out.println("Am3");
	}

	@Override
	public void m4(String name) {
		System.out.println(name);
	}
}
