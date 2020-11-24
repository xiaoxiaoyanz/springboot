package com.wucc.lesson0.demo01;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-10 18:09
 */
public class Man {

	private String name;
	private int age;

	public Man() {
		this.name = "无参";
	}

	public Man(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Man{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
