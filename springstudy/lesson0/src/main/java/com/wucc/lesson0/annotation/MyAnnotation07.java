package com.wucc.lesson0.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {
		ElementType.PACKAGE,
		ElementType.FIELD,
		ElementType.METHOD,
		ElementType.PARAMETER,
		ElementType.CONSTRUCTOR,
		ElementType.TYPE,
		ElementType.TYPE_PARAMETER,
		ElementType.TYPE_USE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation07 {

	MyAnnotation06[] value();

}
