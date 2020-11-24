package com.wucc.lesson0.demo04.model;

import java.beans.ConstructorProperties;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 16:27
 */
public class CardModel {

	private String name;
	private String desc;

	public CardModel() {
	}

	@ConstructorProperties({"name","desc"})
	public CardModel(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "CardModel{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
