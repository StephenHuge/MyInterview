package com.interw.algorithms.sort;

import org.junit.Test;

/**
 * 测试类
 */
public class FactoryTest {

	@Test
	public void test() {
		
		int len = 10000;
		
		int[] unSort = SortTool.getRandomArr(len, len);
		
		Sorts bubble = SortFactory.getSort(BubbleSort.class);	//获取原始的排序类
		Sorts quick = SortFactory.getSort(QuickSort.class);
		Sorts merge = SortFactory.getSort(MergeSort.class);
		
		Sorts bProxy = (Sorts) new SortProxy(bubble).getProxy();//生成动态代理的排序类
		Sorts qProxy = (Sorts) new SortProxy(quick).getProxy();//生成动态代理的排序类
		Sorts mProxy = (Sorts) new SortProxy(merge).getProxy();//生成动态代理的排序类
		
		bProxy.sort(unSort);
		qProxy.sort(unSort);
		mProxy.sort(unSort);
		
		
		/*为了对比不删除以下代码                                                 */
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
