package com.wucc.lesson0.cglib;

import com.wucc.lesson0.cglib.model.Service1;
import com.wucc.lesson0.cglib.model.Service2;
import org.junit.Test;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 15:24
 */
public class CglibTest {

	@Test
	public void test01(){

		//使用Enhancer来给某个类创建代理类，步骤
		//1.创建Enhancer对象
		Enhancer enhancer = new Enhancer();
		//2.通过setSuperclass来设置父类型，即需要给哪个类创建代理类
		enhancer.setSuperclass(Service1.class);
		/*3.设置回调，需实现org.springframework.cglib.proxy.Callback接口，
		此处我们使用的是org.springframework.cglib.proxy.MethodInterceptor，也是一个接 口，实现了Callback接口，
		当调用代理对象的任何方法的时候，都会被MethodInterceptor接口的invoke方法处理*/


		/*** 代理对象方法拦截器
		 * * @param o 代理对象
		 * * @param method 被代理的类的方法，即Service1中的方法
		 * * @param objects 调用方法传递的参数
		 * * @param methodProxy 方法代理对象
		 * * @return * @throws Throwable */
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("被调用方法"+method.getName());
				//可以调用MethodProxy的invokeSuper调用被代理类的方法
				Object invoke = methodProxy.invokeSuper(o, objects);
				return invoke;
			}
		});

		//4.获取代理对象,调用enhancer.create方法获取代理对象，这个方法返回的是Object类型 的，所以需要强转一下
		Service1 service1 = (Service1)enhancer.create();
		service1.test1();


	}


	@Test
	public void test02(){

		//使用Enhancer来给某个类创建代理类，步骤
		//1.创建Enhancer对象
		Enhancer enhancer = new Enhancer();
		//2.通过setSuperclass来设置父类型，即需要给哪个类创建代理类
		enhancer.setSuperclass(Service2.class);
		/*3.设置回调，需实现org.springframework.cglib.proxy.Callback接口，
		此处我们使用的是org.springframework.cglib.proxy.MethodInterceptor，也是一个接 口，实现了Callback接口，
		当调用代理对象的任何方法的时候，都会被MethodInterceptor接口的invoke方法处理*/


		/*** 代理对象方法拦截器
		 * * @param o 代理对象
		 * * @param method 被代理的类的方法，即Service1中的方法
		 * * @param objects 调用方法传递的参数
		 * * @param methodProxy 方法代理对象
		 * * @return * @throws Throwable */
		enhancer.setCallback(new FixedValue() {
			@Override
			public Object loadObject() throws Exception {
				return "haha";
			}
		});

		//4.获取代理对象,调用enhancer.create方法获取代理对象，这个方法返回的是Object类型 的，所以需要强转一下
		Service2 service2 = (Service2)enhancer.create();

		String str1 = service2.str1();
		System.out.println(str1);

		String str2 = service2.str2();
		System.out.println(str2);
		System.out.println(service2.toString());

	}


	@Test
	public void test03(){

		//使用Enhancer来给某个类创建代理类，步骤
		//1.创建Enhancer对象
		Enhancer enhancer = new Enhancer();
		//2.通过setSuperclass来设置父类型，即需要给哪个类创建代理类
		enhancer.setSuperclass(Service2.class);
		/*3.设置回调，需实现org.springframework.cglib.proxy.Callback接口，
		此处我们使用的是org.springframework.cglib.proxy.MethodInterceptor，也是一个接 口，实现了Callback接口，
		当调用代理对象的任何方法的时候，都会被MethodInterceptor接口的invoke方法处理*/


		/*** 代理对象方法拦截器
		 * * @param o 代理对象
		 * * @param method 被代理的类的方法，即Service1中的方法
		 * * @param objects 调用方法传递的参数
		 * * @param methodProxy 方法代理对象
		 * * @return * @throws Throwable */
		enhancer.setCallback(NoOp.INSTANCE);

		//4.获取代理对象,调用enhancer.create方法获取代理对象，这个方法返回的是Object类型 的，所以需要强转一下
		Service2 service2 = (Service2)enhancer.create();

		String str1 = service2.str1();
		System.out.println(str1);

		String str2 = service2.str2();
		System.out.println(str2);


	}



	@Test
	public void test04(){

		//使用Enhancer来给某个类创建代理类，步骤
		//1.创建Enhancer对象
		Enhancer enhancer = new Enhancer();
		//2.通过setSuperclass来设置父类型，即需要给哪个类创建代理类
		enhancer.setSuperclass(Service2.class);
		/*3.设置回调，需实现org.springframework.cglib.proxy.Callback接口，
		此处我们使用的是org.springframework.cglib.proxy.MethodInterceptor，也是一个接 口，实现了Callback接口，
		当调用代理对象的任何方法的时候，都会被MethodInterceptor接口的invoke方法处理*/


		/*** 代理对象方法拦截器
		 * * @param o 代理对象
		 * * @param method 被代理的类的方法，即Service1中的方法
		 * * @param objects 调用方法传递的参数
		 * * @param methodProxy 方法代理对象
		 * * @return * @throws Throwable */

		Callback[] callbacks = {
				new MethodInterceptor(){

					@Override
					public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
						Object o1 = methodProxy.invokeSuper(o, objects);
						return o1;
					}
				},
				new FixedValue() {
					@Override
					public Object loadObject() throws Exception {
						return "haha";
					}
				}

		};
		enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
				return 0;
			}

		});

		enhancer.setCallbacks(callbacks);
		enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
				String name = method.getName();

				/*** 方法名称以insert开头，
				 * * 返回callbacks中的第1个Callback对象来处理当前方法，
				 * * 否则使用第二个Callback处理被调用的方法 */
				return name.startsWith("str")?0:1;
			}
		});

		//4.获取代理对象,调用enhancer.create方法获取代理对象，这个方法返回的是Object类型 的，所以需要强转一下
		Service2 service2 = (Service2)enhancer.create();

		String str1 = service2.str1();
		System.out.println(str1);

		String str2 = service2.str2();
		System.out.println(str2);

		String insert1 = service2.insert1();
		System.out.println(insert1);

		String insert2 = service2.insert2();
		System.out.println(insert2);


	}

	@Test
	public void test05(){
		Service1 proxy = CostTimeProxy.createProxy(new Service1());

		proxy.test1();

	}




}
