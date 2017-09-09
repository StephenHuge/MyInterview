package com.interw.algorithms.sort;

import org.junit.Test;

/**
 * ������
 */
public class FactoryTest {

	@Test
	public void test() {
		
		int len = 10000;
		
		int[] unSort = SortTool.getRandomArr(len, len);
		
		Sorts bubble = SortFactory.getSort(BubbleSort.class);	//��ȡԭʼ��������
		Sorts quick = SortFactory.getSort(QuickSort.class);
		Sorts merge = SortFactory.getSort(MergeSort.class);
		
		Sorts bProxy = (Sorts) new SortProxy(bubble).getProxy();//���ɶ�̬�����������
		Sorts qProxy = (Sorts) new SortProxy(quick).getProxy();//���ɶ�̬�����������
		Sorts mProxy = (Sorts) new SortProxy(merge).getProxy();//���ɶ�̬�����������
		
		bProxy.sort(unSort);
		qProxy.sort(unSort);
		mProxy.sort(unSort);
		
		
		/*Ϊ�˶ԱȲ�ɾ�����´���                                                 */
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
