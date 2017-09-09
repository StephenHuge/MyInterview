package com.interw.algorithms.sort;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void test() {
		
		int[] unSort = SortTool.getRandomArr(10000, 10000);
		
		Sorts bubble = SortFactory.getSort(BubbleSort.class);
		Sorts quick = SortFactory.getSort(QuickSort.class);
		Sorts merge = SortFactory.getSort(MergeSort.class);
		
		long startTimeb = System.nanoTime();   //程序开始时间  
		bubble.sort(unSort);
		long endTimeb = System.nanoTime(); //结束时间
		System.out.println("冒泡排序程序运行时间为 "+(double)((endTimeb - startTimeb)) / 1000000000 +"s");
		
		long startTimeq = System.nanoTime();   //程序开始时间
		quick.sort(unSort);
		long endTimeq = System.nanoTime(); //结束时间
		System.out.println("快速排序程序运行时间为 "+(double)((endTimeq - startTimeq)) / 1000000000 +"s");
		
		long startTimem = System.nanoTime();   //程序开始时间
		merge.sort(unSort);
		long endTimem = System.nanoTime(); //结束时间
		System.out.println("归并排序程序运行时间为 "+(double)((endTimem - startTimem)) / 1000000000 +"s");

	}

}
