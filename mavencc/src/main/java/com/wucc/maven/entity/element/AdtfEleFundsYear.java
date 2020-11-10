package com.wucc.maven.entity.element;


import java.io.Serializable;

/**
 * 经费年度表(AdtfEleFundsYear)实体类
 *
 * @author makejava
 * @since 2020-08-07 13:46:19
 */


public class AdtfEleFundsYear implements Serializable {
	private static final long serialVersionUID = 823930220044805596L;
	/**
	 * 登录用户id
	 */
	private String userId;
	/**
	 * 经费年度
	 */
	private String fundsYear;
	/**
	 * 单位编码
	 */

	private String agencyCode;
	/**
	 * 设置年度
	 */

	private String setYear;
	/**
	 * 系统类型
	 */

	private String sysType;

	/**
	 * 当前经费年度
	 */

	private String isCurrent;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFundsYear() {
		return fundsYear;
	}

	public void setFundsYear(String fundsYear) {
		this.fundsYear = fundsYear;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getSetYear() {
		return setYear;
	}

	public void setSetYear(String setYear) {
		this.setYear = setYear;
	}

	public String getSysType() {
		return sysType;
	}

	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	public String getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}
}
