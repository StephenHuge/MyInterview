package com.interw.algorithms.sort;

/**
 * 冒泡排序。
 * 基本思想是：两两比较相邻记录的关键字，如果反序则交换，直到没有反序的记录为止。
 */
public class BubbleSort implements Sorts{

	@Override
	public int[] sort(int[] unSort) {
		if(unSort == null || unSort.length == 0) 	return null;
		
		for(int i = 0; i < unSort.length; i++) {
			for(int j = i + 1; j < unSort.length; j++) {
				if(unSort[i] > unSort[j]) {
					SortTool.swap(unSort, i, j);
				}
			}
		}
		int[] sorted = unSort;
		
		return sorted;
	}
	
	public static void main(String[] args) {
		int[] arr = SortTool.getRandomArr(50000, 50000);
		
		long startTime=System.nanoTime();   //程序开始时间  
		arr = new BubbleSort().sort(arr);
		long endTime=System.nanoTime(); //结束时间  

		SortTool.print(arr);
		System.out.println("程序运行时间为 "+(double)((endTime-startTime)) / 1000000000 +"s"); 
	}
}
