package com.interw.algorithms.sort;

public class QuickSort implements Sorts{

	@Override
	public int[] sort(int[] unSort) {
		if(unSort == null || unSort.length == 0) 	return null;
		return quickSort(unSort, 0, unSort.length - 1);
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
		
//		int[] pivots = {arr[left], arr[right], arr[(left + right) / 2]};	//确定更好的pivot，减少排序次数
//		int pivot = SortTool.getMiddle(pivots);

		while(left < right) {

			while(left < right && arr[right] >= pivot)	right--;
			arr[left] = arr[right];

			while(left < right && arr[left] <= pivot)	left++;
			arr[right] = arr[left];
		}
		arr[left] = pivot;
		return left;
	}
	
	public static void main(String[] args) {
//		int[] arr = {6, 2, 3, 7, 4, 8, 9};
		int[] arr = SortTool.getRandomArr(50000, 50000);
		
		long startTime=System.nanoTime();   //程序开始时间  
		new QuickSort().sort(arr);
		long endTime=System.nanoTime(); //结束时间  

		SortTool.print(arr);
		System.out.println("程序运行时间为 "+(double)((endTime-startTime)) / 1000000000 +"s");
	}
}
