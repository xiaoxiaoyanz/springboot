package com.wucc.lesson0.demo09.model;



/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 10:22
 */
public class ServiceB {

	private String name;
	private ServcieA servcieA;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServcieA getServcieA() {
		return servcieA;
	}

	public void setServcieA(ServcieA servcieA) {
		this.servcieA = servcieA;
	}

	@Override
	public String toString() {
		return "ServiceB{" +
				"name='" + name + '\'' +
				", servcieA=" + servcieA +
				'}';
	}

}
