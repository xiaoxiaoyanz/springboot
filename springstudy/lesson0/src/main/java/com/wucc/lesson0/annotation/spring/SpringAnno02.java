package com.wucc.lesson0.annotation.spring;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringAnno01
public @interface SpringAnno02 {
	String value() default "SpringAnno02";

	@AliasFor(annotation = SpringAnno01.class,value = "value")
	String springAnno01();
}
