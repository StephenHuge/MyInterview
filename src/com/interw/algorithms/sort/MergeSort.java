package com.interw.algorithms.sort;

/**
 * �鲢����
 * ˼·�ǽ������Ϊ��С�ĵ�Ԫ��ÿ����Ԫ�����ڵĵ�Ԫ�������򲢹鲢��һ������Ԫ��֮��
 * ÿ������Ԫ�ٺ����ڵ�����Ԫ�������򲢹鲢��������ɶ��������������
 */
public class MergeSort implements Sorts {

	@Override
	public int[] sort(int[] unSort) {
		if(unSort == null || unSort.length == 0) 	return null;
		int[] sorted = new int[unSort.length];
		mergeSort(unSort, 0, unSort.length - 1, sorted);
		return sorted;
	}

	private void mergeSort(int[] arr, int left, int right, int[] sorted) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid, sorted);		//�������
			mergeSort(arr, mid + 1, right, sorted); //�ұ�����
			mergeArray(arr, left, mid, right, sorted);	//�鲢
		}
	}

	/**
	 * ��������������鲢
	 */
	private void mergeArray(int[] unSort, int left, int mid, int right, int[] sorted) {
		int f = left, m = mid + 1, pivot = 0;	//�ƶ����±�
		
		while(f < mid + 1 && m < right + 1 ) {	//�鲢��������
			if(unSort[f] <= unSort[m]) 
				sorted[pivot++] = unSort[f++];
			else 
				sorted[pivot++] = unSort[m++];
		}
		
		while(f < mid + 1) 		//�����һ���Ѿ������ˣ�ֱ�Ӹ���ǰ���һ��
			sorted[pivot++] = unSort[f++];
		while(m < right + 1 )		//ǰ���һ���Ѿ������ˣ�ֱ�Ӹ��ƺ����һ��
			sorted[pivot++] = unSort[m++];
		
		for(f = 0; f < pivot; f++) 	//���Ѿ��ź��������θ��Ƶ�ԭ��������
			unSort[left + f] = sorted[f];
	}
}	
