package com.wucc.lesson0.proxy;

import com.wucc.lesson0.proxy.model.CostTimeInvocationHandler;
import com.wucc.lesson0.proxy.model.Iservice;
import com.wucc.lesson0.proxy.model.impl.ServiceA;
import com.wucc.lesson0.proxy.model.impl.ServiceB;
import com.wucc.lesson0.proxy.model.impl.ServiceProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 11:22
 */

public class ProxyTest {

	@Test
	public void test01(){
		Iservice iservice = new ServiceA();
		iservice.m1();
		iservice.m2();
		iservice.m3();
		iservice = new ServiceB();
		iservice.m1();
		iservice.m2();
		iservice.m3();
	}

	@Test
	public void test02(){
		Iservice iservice = new ServiceProxy(new ServiceA());
		iservice.m1();
		iservice.m2();
		iservice.m3();
		iservice = new ServiceProxy(new ServiceB());
		iservice.m1();
		iservice.m2();
		iservice.m3();
	}
	@Test
	public void test03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<Iservice> proxyClass =(Class<Iservice>) Proxy.getProxyClass(Iservice.class.getClassLoader(), Iservice.class);

		InvocationHandler invocationHandler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				System.out.println("invocationHandler"+method.getName());
				return null;
			}
		};
		Iservice iservice = proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);

		iservice.m1();
		iservice.m2();
		iservice.m3();


	}

	@Test
	public void test04(){

		InvocationHandler invocationHandler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				System.out.println("invocationHandler"+"========="+method.getName());
				return null;
			}
		};

		Iservice iservice = (Iservice)Proxy.newProxyInstance(Iservice.class.getClassLoader(), new Class[]{Iservice.class}, invocationHandler);
		iservice.m1();
		iservice.m2();
		iservice.m3();
	}


	@Test
	public void test05(){

		Iservice proxyA = CostTimeInvocationHandler.createProxy(new ServiceA(), Iservice.class);
		Iservice proxyB = CostTimeInvocationHandler.createProxy(new ServiceB(), Iservice.class);

		proxyA.m2();

		proxyB.m1();

		proxyA.m4("haha");
	}







}
