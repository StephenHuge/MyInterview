package com.interw.algorithms.sort;

/**
 * ��̬��������ʵ���Ĺ���
 */
public class SortFactory {
	public static Sorts getSort(Class<?> clazz) {
		
		Sorts sort = null;
		
		try {
			sort = (Sorts) Class.forName(clazz.getName()).newInstance();	//ͨ�������������������ʵ��
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sort;
	}
}
