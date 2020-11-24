package com.wucc.lesson0.demo05.model;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 15:03
 */
public class UserModel {

	private String name;
	private String password;
	private Integer age;

	public UserModel(String name ,String password){
		this.name = name;
		this.password = password;
	}

	public UserModel(String name, String password, Integer age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserModel{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				'}';
	}
}
