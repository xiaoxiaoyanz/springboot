package com.wucc.lesson0.annotation.spring;

import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-27 14:25
 */
@SpringAnno02(value = "spring002",springAnno01 = "spring001")
@Component
public class TestSpringAnno {

	@Test
	public void test() {

		System.out.println(AnnotatedElementUtils.getMergedAnnotation(TestSpringAnno.class,SpringAnno02.class));
		System.out.println(AnnotatedElementUtils.getMergedAnnotation(TestSpringAnno.class,SpringAnno01.class));
	}


}
