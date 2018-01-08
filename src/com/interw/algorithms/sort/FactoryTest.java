package com.interw.algorithms.sort;

import org.junit.Test;

/**
 * 测试类
 */
public class FactoryTest {

	@Test
	public void test() {
		
		int len = 10000;
		
		//生成数组
		int[] unSort1 = SortTool.getRandomArr(len, len);
		
		int[] unSortT = unSort1.clone();
		int[] unSort2 = unSort1.clone();
		int[] unSort3 = unSort1.clone();
		
		
		//获取原始的排序类
		Sorts bubble = SortFactory.getSort(BubbleSort.class);
		Sorts quick = SortFactory.getSort(QuickSort.class);
		Sorts merge = SortFactory.getSort(MergeSort.class);
		
		//生成动态代理的排序类
		Sorts bProxy = (Sorts) new SortProxy(bubble).getProxy();
		Sorts qProxy = (Sorts) new SortProxy(quick).getProxy();
		Sorts mProxy = (Sorts) new SortProxy(merge).getProxy();
		
		//排序
		bProxy.sort(unSort1);
		bProxy.sort(unSortT);
		qProxy.sort(unSort2);
		mProxy.sort(unSort3);
		
		
		
		/*为了对比使用及不使用代理模式不删除以下代码 */
		
//		long startTimeb = System.nanoTime();   //程序开始时间  
//		bubble.sort(unSort);
//		long endTimeb = System.nanoTime(); //结束时间
//		System.out.println("冒泡排序程序运行时间为 "+(double)((endTimeb - startTimeb)) / 1000000000 +"s");
//		
//		long startTimeq = System.nanoTime();   //程序开始时间
//		quick.sort(unSort);
//		long endTimeq = System.nanoTime(); //结束时间
//		System.out.println("快速排序程序运行时间为 "+(double)((endTimeq - startTimeq)) / 1000000000 +"s");
//		
//		long startTimem = System.nanoTime();   //程序开始时间
//		merge.sort(unSort);
//		long endTimem = System.nanoTime(); //结束时间
//		System.out.println("归并排序程序运行时间为 "+(double)((endTimem - startTimem)) / 1000000000 +"s");

	}

}
