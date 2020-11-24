package com.wucc.lesson0.demo06.bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-19 10:50
 */
public class NormolBean {

	public static class Bean1 implements DisposableBean{

		public Bean1() {
			System.out.println(this.getClass()+"constructor!");
		}

		@Override
		public void destroy() throws Exception {
			System.out.println(this.getClass()+"destroy()");
		}
	}
	public static class Bean2 implements DisposableBean{

		public Bean2() {

			System.out.println(this.getClass()+"constructor!");
		}

		@Override
		public void destroy() throws Exception {
			System.out.println(this.getClass()+"destroy()");
		}
	}
	public static class Bean3 implements DisposableBean{

		public Bean3() {

			System.out.println(this.getClass()+"constructor!");
		}

		@Override
		public void destroy() throws Exception {
			System.out.println(this.getClass()+"destroy()");
		}
	}
}
