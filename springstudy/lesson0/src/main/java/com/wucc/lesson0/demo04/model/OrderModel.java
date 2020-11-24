package com.wucc.lesson0.demo04.model;

import javafx.scene.control.MenuItem;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 16:38
 */
public class OrderModel {

	private UserModel userModel;
	private MenuModel menuModel;

	public OrderModel() {
	}

	public OrderModel(UserModel userModel, MenuModel menuModel) {
		this.userModel = userModel;
		this.menuModel = menuModel;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	public MenuModel getMenuModel() {
		return menuModel;
	}

	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}

	@Override
	public String toString() {
		return "OrderModel{" +
				"userModel=" + userModel +
				", menuModel=" + menuModel +
				'}';
	}
}
