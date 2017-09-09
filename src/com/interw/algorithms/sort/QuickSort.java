package com.interw.algorithms.sort;

/**
 * 快速排序。
 * 思路是确定一个pivot，把数组按pivot为基准分为比基准小的一半和比基准大的一半，之后分别对这两半递归上述
 * 过程，直到结束。
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
			quickSort(arr, left, point);	//左边递归排序
			quickSort(arr, point + 1, right);	//右边递归排序
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
