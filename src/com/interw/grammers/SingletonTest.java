package com.interw.grammers;

public class SingletonTest {
	
	private SingletonTest() {
		System.out.println("cons");
	}
	
	public static SingletonTest getInstance() {
		return InstanceHolder.st;
	}
	/**
	 * 内部静态类实现单例模式
	 * @author Administrator
	 * 
	 * @date 2017年8月30日 下午3:39:24
	 */
	private static class InstanceHolder {
		private static final SingletonTest st = new SingletonTest();
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonTest.getInstance());
		System.out.println(SingletonTest.getInstance());
		
	}
}
