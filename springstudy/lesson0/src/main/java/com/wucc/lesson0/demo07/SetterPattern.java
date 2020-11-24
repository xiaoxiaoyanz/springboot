package com.wucc.lesson0.demo07;

import java.net.ServerSocket;
import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-19 11:34
 */
public class SetterPattern {

	public  interface  Service{}

	public static class ServiceA implements Service{}
	public static class ServiceB implements Service{}

	private Service service;

	public void setService(Service service) {
		this.service = service;
		System.out.println(service);
	}
	public void setService1(List<Service> service){
		System.out.println(service);
	}
}
