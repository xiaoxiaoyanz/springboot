package com.wucc.designpattern.single;

/**
 * <p>
 *匿名内部类实现单例模式
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-15 13:34
 */
public class SingleInner {

	private SingleInner(){

	}

	private static class SingleInnerInstance{
		private static final SingleInner INSTANCE = new SingleInner();
	}

	public static SingleInner getInstance(){
		return SingleInnerInstance.INSTANCE;
	}
}
