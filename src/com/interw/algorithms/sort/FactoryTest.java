package com.interw.algorithms.sort;

import org.junit.Test;

/**
 * ������
 */
public class FactoryTest {

	@Test
	public void test() {
		
		int len = 10000;
		
		//��������
		int[] unSort1 = SortTool.getRandomArr(len, len);
		
		int[] unSortT = unSort1.clone();
		int[] unSort2 = unSort1.clone();
		int[] unSort3 = unSort1.clone();
		
		
		//��ȡԭʼ��������
		Sorts bubble = SortFactory.getSort(BubbleSort.class);
		Sorts quick = SortFactory.getSort(QuickSort.class);
		Sorts merge = SortFactory.getSort(MergeSort.class);
		
		//���ɶ�̬�����������
		Sorts bProxy = (Sorts) new SortProxy(bubble).getProxy();
		Sorts qProxy = (Sorts) new SortProxy(quick).getProxy();
		Sorts mProxy = (Sorts) new SortProxy(merge).getProxy();
		
		//����
		bProxy.sort(unSort1);
		bProxy.sort(unSortT);
		qProxy.sort(unSort2);
		mProxy.sort(unSort3);
		
		
		
		/*Ϊ�˶Ա�ʹ�ü���ʹ�ô���ģʽ��ɾ�����´��� */
		
//		long startTimeb = System.nanoTime();   //����ʼʱ��  
//		bubble.sort(unSort);
//		long endTimeb = System.nanoTime(); //����ʱ��
//		System.out.println("ð�������������ʱ��Ϊ "+(double)((endTimeb - startTimeb)) / 1000000000 +"s");
//		
//		long startTimeq = System.nanoTime();   //����ʼʱ��
//		quick.sort(unSort);
//		long endTimeq = System.nanoTime(); //����ʱ��
//		System.out.println("���������������ʱ��Ϊ "+(double)((endTimeq - startTimeq)) / 1000000000 +"s");
//		
//		long startTimem = System.nanoTime();   //����ʼʱ��
//		merge.sort(unSort);
//		long endTimem = System.nanoTime(); //����ʱ��
//		System.out.println("�鲢�����������ʱ��Ϊ "+(double)((endTimem - startTimem)) / 1000000000 +"s");

	}

}
