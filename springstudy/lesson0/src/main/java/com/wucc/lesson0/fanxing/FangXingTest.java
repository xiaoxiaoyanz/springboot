package com.wucc.lesson0.fanxing;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-25 15:07
 */
public class FangXingTest {

	@Test
	public void test01() {
		/*FanXing fanXing = new FanXing();
		Class<? extends FanXing> aClass = fanXing.getClass();
		TypeVariable<? extends Class<? extends FanXing>>[] typeParameters = aClass.getTypeParameters();*/

		/*
		* 这个接口表示的是泛型变量，例如：List<T>中的T就是类型变量；
		* 而class C1<T1,T2,T3>{}表示一个类，这个类中定义了3个泛型变量类型，分别是T1、T2和T2，泛型变量在java中使用TypeVariable接口来表示，
		* 可以通过这个接口提供的方法获取泛型变量类型的详细信息。常用的方法
          Type[] getBounds()
          获取泛型变量类型的上边界，如果未明确什么上边界默认为Object。例如：class Test<K extend Person>中K的上边界只有一个,是Person；
          * 而class Test<T extend List & Iterable>中T的上边界有2个，是List和Iterable

         D getGenericDeclaration()
        获取声明该泛型变量的原始类型，例如：class Test<K extend Person>中的K为泛型变量，
        * 这个泛型变量时Test类定义的时候声明的，说明如果调用getGenericDeclaration方法返回的就是Test对应的Class对象。
        * 还有方法中也可以定义泛型类型的变量，如果在方法中定义，那么上面这个方法返回的就是定义泛型变量的方法了，返回的就是Method对象。
        String getName()
        获取在源码中定义时的名字，如：class Test<K extend Person>就是K；class Test1<T>中就是T。*/

		TypeVariable<Class<FanXing>>[] typeParameters1 = FanXing.class.getTypeParameters();
		for (TypeVariable<Class<FanXing>> classTypeVariable : typeParameters1) {
			System.out.println("变量名称" + classTypeVariable.getName());
			System.out.println("这个变量在哪声明的" + classTypeVariable.getGenericDeclaration());
			Type[] bounds = classTypeVariable.getBounds();
			System.out.println("这个变量上边界数量:" + bounds.length);
			System.out.println("这个变量上边界清单:");
			for (Type bound : bounds) {
				System.out.println(bound.getTypeName());
			}
			System.out.println("--------------------");
		}

	}
	@Test
	public void test02(){
		//获取所有方法
		Method[] declaredMethods = FanXing.class.getDeclaredMethods();
		//找到test01方法
		Method test01 = null;
		for (Method declaredMethod : declaredMethods) {
			if (declaredMethod.getName().equals("test01")){
				test01 = declaredMethod;
				break;
			}
		}

		//获取方法的泛型参数列表
		System.out.println("test01参数类型列表信息:=====================================");


		/*
		*Method implements TypeVariable
		* 这个类用来表示java中的任何一个方法，通过这个类可以获取java中方法的任何信息，比如：方法的修饰符、方法名称、方法的参数、方法返回值、方法中声明的泛型参数列表等方法的一切信息。常用的方法
         String getName()
        用来获取方法的名称。

       Type[] getGenericParameterTypes()
       返回方法的参数信息，如果参数是泛型类型的，会返回泛型的详细信息，这个方法后面会演示。

        Type getGenericReturnType()
        返回方法的返回值类型，如果返回值是泛型的，会包含泛型的详细信息。

         TypeVariable<Method>[] getTypeParameters()
         Method类继承了java.lang.reflect.GenericDeclaration接口，上面这个方法是在GenericDeclaration接口中定义的，Method类中实现了这个接口，用于返回当前方法中声明的泛型变量参数列表。*/

		//获取参数的所有泛型类型信息
		Type[] genericParameterTypes = test01.getGenericParameterTypes();
		for (Type genericParameterType : genericParameterTypes) {

			//3个参数都是泛型变量类型的，对应java中的TypeVariable
			if (genericParameterType instanceof TypeVariable) {
				TypeVariable pt = (TypeVariable) genericParameterType;
				System.out.println("变量类型名称:" + pt.getTypeName());
				System.out.println("变量名称:" + pt.getName());
				System.out.println("这个变量在哪声明的:" + pt.getGenericDeclaration());
				Type[] bounds = pt.getBounds();
				System.out.println("这个变量上边界数量:" + bounds.length);
				System.out.println("这个变量上边界清单:");
				for (Type bound : bounds) {
					System.out.println(bound.getTypeName());
				}
			} else if (genericParameterType instanceof Class) {
				Class pt = (Class) genericParameterType;
				System.out.println("参数类型名称:" + pt.getTypeName());
				System.out.println("参数类名:" + pt.getName());
			}
			System.out.println("--------------------");
		}

		//获取方法的返回值
		System.out.println("test01方法返回值类型信息：======================================");
		Type genericReturnType = test01.getGenericReturnType();
		if(genericReturnType instanceof TypeVariable){
			TypeVariable pt = (TypeVariable) genericReturnType;
			System.out.println("变量名称:" + pt.getName());
			System.out.println("这个变量在哪声明的:" + pt.getGenericDeclaration());
			Type[] bounds = pt.getBounds();
			System.out.println("这个变量上边界数量:" + bounds.length);
			System.out.println("这个变量上边界清单:");
			for (Type bound : bounds) {
				System.out.println(bound.getTypeName());
			}
			System.out.println("--------------------");
		}

		//获取方法中声明的泛型参数列表
		System.out.println("test01方法声明的泛型参数列表类型信息：======================================");
		TypeVariable<Method>[] typeParameters = test01.getTypeParameters();

		for (TypeVariable<Method> pt : typeParameters) {
			System.out.println("变量类型名称:" + pt.getTypeName());
			System.out.println("变量名称:" + pt.getName());
			System.out.println("这个变量在哪声明的:" + pt.getGenericDeclaration());
			Type[] bounds = pt.getBounds();
			System.out.println("这个变量上边界数量:" + bounds.length);
			System.out.println("这个变量上边界清单:");
			for (Type bound : bounds) {
				System.out.println(bound.getTypeName());
			}
			System.out.println("--------------------");
		}


	}

}
