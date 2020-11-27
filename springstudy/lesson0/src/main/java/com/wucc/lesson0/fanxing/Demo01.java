package com.wucc.lesson0.fanxing;

import com.wucc.lesson0.fanxing.type.DemoInter01;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-25 16:16
 */


public class Demo01<T extends DemoInter01> {


	/*方法返回值和参数是泛型
	 * */
	public List<T> getList(List<T> list) {
		return list;
	}

	public static void main(String[] args) throws NoSuchMethodException {
		//获取getList方法
		Method getList = Demo01.class.getMethod("getList", List.class);

		//调用Method中的getGenericParameterTypes方法可以获取参数类型列表，包含了详细的泛型信息
		Type genericParameterType = getList.getGenericParameterTypes()[0];
		//getList方法有1个参数是泛型类型的，泛型类型java中用ParameterizedType接口表示
		System.out.println("----------getList方法参数类型信息------------");
		if (genericParameterType instanceof ParameterizedType) {//@3
			ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
			System.out.println("原始类型：" + parameterizedType.getRawType());
			System.out.println("所属的类型:" + parameterizedType.getOwnerType());
			Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
			//泛型中第一个参数的类型是T，T是泛型变量，泛型变量对应java中的TypeVariable接口
			Type oneType = actualTypeArguments[0];//@4
			System.out.println("@5:" + oneType.getClass());//@5
			if (oneType instanceof TypeVariable) {
				System.out.println("这个参数是个泛型变量类型！");
				TypeVariable<Class<Demo01>> oneActualType = (TypeVariable) oneType;
				System.out.println("变量名称:" + oneActualType.getName());
				System.out.println("这个变量在哪声明的:" + oneActualType.getGenericDeclaration());
				Type[] bounds = oneActualType.getBounds();
				System.out.println("这个变量上边界数量:" + bounds.length);
				System.out.println("这个变量上边界清单:");
				for (Type bound : bounds) {
					System.out.println(bound.getTypeName());
				}
			}
		}

		System.out.println("----------getList方法返回值类型信息------------");
		//m1方法返回值是泛型类型的，泛型类型java中用ParameterizedType接口表示
		//Method类中的getGenericReturnType方法可以获取方法的返回值，如果返回值是泛型类型的，会获取泛型类型对应的具体类型，此处返回的是List<String>类型的，java中使用ParameterizedType接口表示
		Type returnType = getList.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {//@6
			ParameterizedType parameterizedType = (ParameterizedType) returnType;
			System.out.println("原始类型：" + parameterizedType.getRawType());
			System.out.println("所属的类型:" + parameterizedType.getOwnerType());
			Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
			//泛型中第一个参数的类型是T，T是泛型变量，泛型变量对应java中的TypeVariable接口
			Type oneType = actualTypeArguments[0];//@7
			System.out.println("@8:" + oneType.getClass());//@8
			if (oneType instanceof TypeVariable) {
				System.out.println("返回值是个泛型变量类型！");
				TypeVariable<Class<Demo01>> oneActualType = (TypeVariable) oneType;
				System.out.println("变量名称:" + oneActualType.getName());
				System.out.println("这个变量在哪声明的:" + oneActualType.getGenericDeclaration());
				Type[] bounds = oneActualType.getBounds();
				System.out.println("这个变量上边界数量:" + bounds.length);
				System.out.println("这个变量上边界清单:");
				for (Type bound : bounds) {
					System.out.println(bound.getTypeName());
				}
				System.out.println("--------------------");
			}
		}


	}
}
