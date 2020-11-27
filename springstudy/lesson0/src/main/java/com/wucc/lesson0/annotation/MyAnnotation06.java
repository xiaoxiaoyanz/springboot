package com.wucc.lesson0.annotation;

import java.lang.annotation.*;

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
@Repeatable(MyAnnotation07.class)
public @interface MyAnnotation06 {

	String value() ;

}
