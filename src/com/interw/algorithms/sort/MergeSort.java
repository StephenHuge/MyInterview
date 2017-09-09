package com.interw.algorithms.sort;

/**
 * 归并排序。
 * 思路是将数组分为最小的单元，每个单元和相邻的单元进行排序并归并成一个有序单元，之后
 * 每个有序单元再和相邻的有序单元进行排序并归并，最终完成对整个数组的排序。
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
			mergeSort(arr, left, mid, sorted);		//左边有序
			mergeSort(arr, mid + 1, right, sorted); //右边有序
			mergeArray(arr, left, mid, right, sorted);	//归并
		}
	}

	/**
	 * 将两个有序数组归并
	 */
	private void mergeArray(int[] unSort, int left, int mid, int right, int[] sorted) {
		int f = left, m = mid + 1, pivot = 0;	//移动的下标
		
		while(f < mid + 1 && m < right + 1 ) {	//归并两段数组
			if(unSort[f] <= unSort[m]) 
				sorted[pivot++] = unSort[f++];
			else 
				sorted[pivot++] = unSort[m++];
		}
		
		while(f < mid + 1) 		//后面的一段已经用完了，直接复制前面的一段
			sorted[pivot++] = unSort[f++];
		while(m < right + 1 )		//前面的一段已经用完了，直接复制后面的一段
			sorted[pivot++] = unSort[m++];
		
		for(f = 0; f < pivot; f++) 	//将已经排好序的数组段复制到原数组里面
			unSort[left + f] = sorted[f];
	}
}	
