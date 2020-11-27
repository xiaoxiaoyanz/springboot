
package com.wucc.lesson0.annotation;


import lombok.SneakyThrows;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Map;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-25 10:10
 */
@MyAnnotation06("用在类上")
public class TestAnnotation06<@MyAnnotation06("T1") T1,@MyAnnotation06("T2")T2>{

	@MyAnnotation06("用在构造方法上")
	public TestAnnotation06() {
	}

	@MyAnnotation06("用在字段上")
	@MyAnnotation06("用在字段上...")
	private String name;

	private  Map<@MyAnnotation06("用在泛型类型上") String, @MyAnnotation06("用在泛型类型上")Object> map;
	@MyAnnotation06("用在方法上")
	public String m1(@MyAnnotation06("用在参数上") String name,@MyAnnotation06("用在参数上") String password ){

		return  "haha";
	}

	@Test
	public void test01(){
		Annotation[] annotations = TestAnnotation06.class.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
	}

	@Test
	public void test02(){
		TypeVariable<Class<TestAnnotation06>>[] typeParameters = TestAnnotation06.class.getTypeParameters();
		for (TypeVariable<Class<TestAnnotation06>> typeParameter : typeParameters) {
			System.out.println(typeParameter.getName()+"类型的注解是：");
			Annotation[] annotations = typeParameter.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
		}
	}

	@Test
	public void test03() throws NoSuchFieldException {
		Field name = TestAnnotation06.class.getDeclaredField("name");
		Annotation[] annotations = name.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);

		}
	}

	@Test
	public void test04() throws NoSuchFieldException {
		Field map1 = TestAnnotation06.class.getDeclaredField("map");
		Type map = map1.getGenericType();
		Type[] actualTypeArguments = ((ParameterizedType) map).getActualTypeArguments();
		AnnotatedType annotatedType = map1.getAnnotatedType();
		AnnotatedType[] annotatedActualTypeArguments = ((AnnotatedParameterizedType) annotatedType).getAnnotatedActualTypeArguments();
		int i = 0;
		for (AnnotatedType annotatedActualTypeArgument : annotatedActualTypeArguments) {
			Type actualTypeArgument = actualTypeArguments[i++];
			System.out.println(actualTypeArgument.getTypeName()+"类型上注解为");
			Annotation[] annotations = annotatedActualTypeArgument.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
		}
	}

	@Test
	public void test05(){
		Constructor<?> constructor = TestAnnotation06.class.getConstructors()[0];
		Annotation[] annotations = constructor.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
	}


	@Test
	public void test06() throws NoSuchMethodException {
		Method m1 = TestAnnotation06.class.getMethod("m1", String.class,String.class);
		Annotation[] annotations = m1.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}

	}

	@Test
	public void test07() throws NoSuchMethodException {
		Method m1 = TestAnnotation06.class.getMethod("m1", String.class, String.class);
		Parameter[] parameters = m1.getParameters();
		for (Parameter parameter : parameters) {
			Annotation[] annotations = parameter.getAnnotations();
			System.out.println(parameter.getName());
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
		}
	}



}
