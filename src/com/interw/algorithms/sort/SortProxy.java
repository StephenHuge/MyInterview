package com.interw.algorithms.sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SortProxy implements InvocationHandler {

	private Object obj;
	
	public SortProxy(Object obj) {
		this.obj = obj;
	}
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread()
				.getContextClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.nanoTime();   //程序开始时间  
		
		Object result = method.invoke(obj, args);
		
		long endTime = System.nanoTime(); //程序结束时间
		System.out.println( obj.getClass().getName().substring(27) + "运行时间： " 
					+ String.format("%6f", (double) ((endTime - startTime)) / 1000000000) 
					+ "s");
		return result;
	}
}
