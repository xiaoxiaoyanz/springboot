package com.wucc;

import com.wucc.maven.entity.element.AdtfEleFundsYear;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-09 12:26
 */
public class Test {
	public static void main(String[] args) {
		AdtfEleFundsYear adtfEleFundsYear = new AdtfEleFundsYear();
		adtfEleFundsYear.setAgencyCode("001");
		String agencyCode = adtfEleFundsYear.getAgencyCode();
		System.out.println(agencyCode);
	}
}
