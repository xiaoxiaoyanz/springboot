package com.wucc.lesson0.demo08.model;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 10:02
 */
public class ActualBeanDeLazyBean {
	public ActualBeanDeLazyBean() {
		System.out.println("ActualBeanDeLazyBean");
	}

	private LazyInitBean lazyInitBean;

	public LazyInitBean getLazyInitBean() {
		return lazyInitBean;
	}

	public void setLazyInitBean(LazyInitBean lazyInitBean) {
		this.lazyInitBean = lazyInitBean;
	}

	@Override
	public String toString() {
		return "ActualBeanDeLazyBean{" +
				"lazyInitBean=" + lazyInitBean +
				'}';
	}
}
