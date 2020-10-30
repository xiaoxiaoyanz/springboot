package com.wucc.designpattern.single;

/**
 * <p>
 *懒汉式
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-15 13:23
 */
public class SingleLazy {

	private SingleLazy(){

	}

	private static SingleLazy instance;

	//线程不安全，不推荐使用
	/*public static SingleLazy getInstance(){
		if(null == instance){
			instance = new SingleLazy();
		}
		return instance;
	}*/

	//线程安全,同步方法块,不推荐使用
	/*public static synchronized SingleLazy getInstance(){
		if(null == instance){
			instance = new SingleLazy();
		}
		return instance;
	}*/

	//懒汉式(线程安全，同步代码块)应用实例,不推荐使用

	/*public static  SingleLazy getInstance(){
		if(null == instance){
			synchronized (SingleLazy.class){
				instance = new SingleLazy();
			}
		}
		return instance;
	}*/

	//双重检查：在实际开发中，推荐使用这种单例设计模式
	private static volatile SingleLazy singleLazy;


	public static  SingleLazy getInstance(){
		if(null == singleLazy){
			synchronized (SingleLazy.class){
				if(null == singleLazy){
					instance = new SingleLazy();
				}
			}
		}
		return singleLazy;
	}




}
