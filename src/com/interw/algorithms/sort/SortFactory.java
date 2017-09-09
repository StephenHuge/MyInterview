package com.interw.algorithms.sort;

/**
 * ��̬��������ʵ���Ĺ���
 */
public class SortFactory {
	public static Sorts getClass(Class<?> clazz) {
		
		Sorts sort = null;
		
		try {
			sort = (Sorts) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sort;
	}
}