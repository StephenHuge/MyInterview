package com.interw.algorithms.sort;

/**
 * ��������
 * ˼·��ȷ��һ��pivot�������鰴pivotΪ��׼��Ϊ�Ȼ�׼С��һ��ͱȻ�׼���һ�룬֮��ֱ��������ݹ�����
 * ���̣�ֱ��������
 */
public class QuickSort implements Sorts{

	@Override
	public int[] sort(int[] unSort) {
		if(unSort == null || unSort.length == 0) 	return null;
		quickSort(unSort, 0, unSort.length - 1);
		
		int[] sorted = unSort;
		return sorted;
	}

	private int[] quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int point = quickAdjust(arr, left, right);
			quickSort(arr, left, point);	//��ߵݹ�����
			quickSort(arr, point + 1, right);	//�ұߵݹ�����
		}
		return arr;
	}

	private int quickAdjust(int[] arr, int left, int right) {
		int pivot = arr[left];
		
		while(left < right) {
			while(left < right && arr[right] >= pivot)	right--;
			arr[left] = arr[right];

			while(left < right && arr[left] <= pivot)	left++;
			arr[right] = arr[left];
		}
		arr[left] = pivot;
		return left;
	}
}
