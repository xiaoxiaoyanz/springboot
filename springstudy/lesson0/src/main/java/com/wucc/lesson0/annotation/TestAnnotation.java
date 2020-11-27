package com.wucc.lesson0.annotation;

import org.junit.Test;
import org.springframework.core.io.buffer.NettyDataBuffer;

import java.lang.annotation.Annotation;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-25 10:10
 */
@MyAnnotation
@MyAnnotation01(name = "cc")
@MyAnnotation02(name = {"dd","pp"})
@MyAnnotation03(name = {12,456})
public class TestAnnotation <@MyAnnotation04(say = "T0是在类上声明的一个泛型类型变量") T1,@MyAnnotation04(say = "T1是在类上声明的一个泛型类型变量") T2>{

	public <@MyAnnotation04( say = "T2是在方法上声明的泛型类型变量") T2> void m1() {

	}
	@MyAnnotation01(name = "haha")
	public void test01(){

	}

	@Test
	public void test02() throws NoSuchMethodException {

		for (TypeVariable typeParameter : TestAnnotation.class.getTypeParameters()) {
			print(typeParameter);
		}
		for (TypeVariable typeParameter : TestAnnotation.class.getDeclaredMethod("m1").getTypeParameters()) {
			print(typeParameter);
		}



	}

	private static void print(TypeVariable typeVariable) {
		System.out.println("类型变量名称:" + typeVariable.getName());
		/*Annotation[] annotations = typeVariable.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation.toString());
		}*/
		Arrays.stream(typeVariable.getAnnotations()).forEach(System.out::println);
	}


	public class UserAnnotation10<@MyAnnotation05("用在了类变量类型V1上") V1, @MyAnnotation05("用在了类变量 类型V2上") V2> {
		private Map<@MyAnnotation05("用在了泛型类型上") String, Integer> map;

		public <@MyAnnotation05("用在了参数上") T> String m1(String name) {
			return null;
		}
	}
}
