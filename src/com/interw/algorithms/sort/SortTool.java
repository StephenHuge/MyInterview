package com.interw.algorithms.sort;

import java.util.Random;

/**
 * �����õĹ�����
 */
public class SortTool {
	
	/**
	 * ���������е�����ֵ 
	 */
	public static void swap(int[] arr, int pivot1, int pivot2) {
		if(arr == null || arr.length == 0 || pivot1 > arr.length - 1 || pivot2 > arr.length - 1)
			return;
		int temp = arr[pivot1];
		arr[pivot1] = arr[pivot2];
		arr[pivot2] = temp;
	}
	/*
	 *	���ɹ̶����ֵ���̶����ȵ��������
	 */
	public static int[] getRandomArr(int max, int len) {
    	if(len <= 0 || len >= 65535) 	return null;
		System.out.println("���ɵ����鳤��Ϊ�� " + len + ", �������ֵΪ�� " + max);
		
		int[] arr = new int[len];
    	for (int i = 0; i < len; i++) {
    		Random random = new Random();
    		int s = random.nextInt(max) ;	//����0��max֮���С�������
    		arr[i] = s;
		}
		return arr;
	}
	
	/**
	 * ��ӡint������
	 * @param arr
	 */
	public static void print(int[] arr) {
		if(arr == null || arr.length == 0 )	return;
		
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " \t");
			if((i + 1) % 10 == 0)
				System.out.println();	//ÿ10��������
		}
		System.out.println();
	}
}
