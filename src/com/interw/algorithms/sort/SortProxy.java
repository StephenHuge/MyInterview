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
		long startTime = System.nanoTime();   //����ʼʱ��  
		
		Object result = method.invoke(obj, args);
		
		long endTime = System.nanoTime(); //�������ʱ��
		System.out.println( obj.getClass().getName().substring(27) + "����ʱ�䣺 " 
					+ String.format("%6f", (double) ((endTime - startTime)) / 1000000000) 
					+ "s");
		return result;
	}
}
