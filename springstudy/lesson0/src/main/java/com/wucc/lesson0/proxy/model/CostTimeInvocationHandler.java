package com.wucc.lesson0.proxy.model;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-24 14:33
 */
public class CostTimeInvocationHandler implements InvocationHandler {

	protected Object target;

	public CostTimeInvocationHandler(Object target) {
		this.target = target;
	}

	public CostTimeInvocationHandler() {
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long starTime = System.nanoTime();
		Object result = method.invoke(this.target, args);//@1
		long endTime = System.nanoTime();
		System.out.println(this.target.getClass() + method.getName()+"方法耗时(纳秒):" + (endTime - starTime));
		return result;

	}

	public static <T> T createProxy(Object target, Class<T> targetInterface){
		if (!targetInterface.isInterface()){
			throw new IllegalArgumentException("必须是接口类型!");
		} else if (!targetInterface.isAssignableFrom(target.getClass())) {
			throw new IllegalStateException("target必须是targetInterface接口的实现类!");
		}
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new CostTimeInvocationHandler(target));
	}
}
