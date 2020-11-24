package com.wucc.lesson0.demo04.Utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-18 15:19
 */
public class IOCUtils {

	public static ClassPathXmlApplicationContext getApplicationContext(String xml){
		return new ClassPathXmlApplicationContext(xml);
	}
}
