package com.wucc.lesson0.cglib.model;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 15:23
 */
public class Service1 {

	public void test1(){
		System.out.println("test1");
		this.test2();
	}
	public void test2(){
		System.out.println("test2");
	}
	public void test3(){
		System.out.println("test3");
	}
}
