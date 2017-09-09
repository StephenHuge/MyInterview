package com.interw.algorithms.sort;

import java.util.Random;

/**
 * 排序用的工具类
 */
public class SortTool {
	
	/**
	 * 交换数组中的两个值 
	 */
	public static void swap(int[] arr, int pivot1, int pivot2) {
		if(arr == null || arr.length == 0 || pivot1 > arr.length - 1 || pivot2 > arr.length - 1)
			return;
		int temp = arr[pivot1];
		arr[pivot1] = arr[pivot2];
		arr[pivot2] = temp;
	}
	/*
	 *	生成固定最大值，固定长度的随机数组
	 */
	public static int[] getRandomArr(int max, int len) {
    	if(len <= 0 || len >= 65535) 	return null;
		System.out.println("生成的数组长度为： " + len + ", 数组最大值为： " + max);
		
		int[] arr = new int[len];
    	for (int i = 0; i < len; i++) {
    		Random random = new Random();
    		int s = random.nextInt(max) ;	//生成0到max之间大小的随机数
    		arr[i] = s;
		}
		return arr;
	}
	
	/**
	 * 打印int型数组
	 * @param arr
	 */
	public static void print(int[] arr) {
		if(arr == null || arr.length == 0 )	return;
		
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " \t");
			if((i + 1) % 10 == 0)
				System.out.println();	//每10个数换行
		}
		System.out.println();
	}
}
