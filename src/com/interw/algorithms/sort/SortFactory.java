package com.interw.algorithms.sort;

/**
 * 动态生成排序实例的工厂
 */
public class SortFactory {
	public static Sorts getSort(Class<?> clazz) {
		
		Sorts sort = null;
		
		try {
			sort = (Sorts) Class.forName(clazz.getName()).newInstance();	//通过类名反射生成排序的实例
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sort;
	}
}
