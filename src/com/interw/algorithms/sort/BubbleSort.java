package com.interw.algorithms.sort;

/**
 * ð������
 * ����˼���ǣ������Ƚ����ڼ�¼�Ĺؼ��֣���������򽻻���ֱ��û�з���ļ�¼Ϊֹ��
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
		
		long startTime=System.nanoTime();   //����ʼʱ��  
		arr = new BubbleSort().sort(arr);
		long endTime=System.nanoTime(); //����ʱ��  

		SortTool.print(arr);
		System.out.println("��������ʱ��Ϊ "+(double)((endTime-startTime)) / 1000000000 +"s"); 
	}
}
