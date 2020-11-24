package com.wucc.lesson0.demo05.model;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 16:33
 */
public class MenuModel {

	private String label;
	private Integer theSort;

	public MenuModel() {
	}

	public MenuModel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getTheSort() {
		return theSort;
	}

	public void setTheSort(Integer theSort) {
		this.theSort = theSort;
	}

	@Override
	public String toString() {
		return "MenuModel{" +
				"label='" + label + '\'' +
				", theSort=" + theSort +
				'}';
	}
}
