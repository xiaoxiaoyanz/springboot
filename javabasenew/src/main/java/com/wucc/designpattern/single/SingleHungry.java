package com.wucc.designpattern.single;

/**
 * <p>
 *饿汉式
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-15 13:18
 */
public class SingleHungry {

	private SingleHungry(){

	}

	private static SingleHungry singleHungry = new SingleHungry();


	//静态代码块实现
	private static SingleHungry  instance;

	static {
		instance = new SingleHungry();
	}

	public static SingleHungry getSingleHungry(){
		return singleHungry;
	}
}
