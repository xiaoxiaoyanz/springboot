package com.wucc.lesson0.demo06;

import com.wucc.lesson0.demo05.Utils.IOCUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-19 10:54
 */
public class Demo6Test {

	private static String beanXml = "classpath:/com/wucc/lesson0/demo06/bean.xml";

	@Test
	public void test01(){
		ClassPathXmlApplicationContext applicationContext = IOCUtils.getApplicationContext(beanXml);

		applicationContext.close();
	}
}
