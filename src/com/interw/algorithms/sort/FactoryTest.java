package com.interw.algorithms.sort;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void test() {
		
		int[] unSort = SortTool.getRandomArr(10000, 10000);
		
		Sorts bubble = SortFactory.getSort(BubbleSort.class);
		Sorts quick = SortFactory.getSort(QuickSort.class);
		Sorts merge = SortFactory.getSort(MergeSort.class);
		
		long startTimeb = System.nanoTime();   //����ʼʱ��  
		bubble.sort(unSort);
		long endTimeb = System.nanoTime(); //����ʱ��
		System.out.println("ð�������������ʱ��Ϊ "+(double)((endTimeb - startTimeb)) / 1000000000 +"s");
		
		long startTimeq = System.nanoTime();   //����ʼʱ��
		quick.sort(unSort);
		long endTimeq = System.nanoTime(); //����ʱ��
		System.out.println("���������������ʱ��Ϊ "+(double)((endTimeq - startTimeq)) / 1000000000 +"s");
		
		long startTimem = System.nanoTime();   //����ʼʱ��
		merge.sort(unSort);
		long endTimem = System.nanoTime(); //����ʱ��
		System.out.println("�鲢�����������ʱ��Ϊ "+(double)((endTimem - startTimem)) / 1000000000 +"s");

	}

}
