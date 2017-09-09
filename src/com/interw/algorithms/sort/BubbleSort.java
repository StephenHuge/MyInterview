package com.interw.algorithms.sort;

/**
 * √∞≈›≈≈–Ú°£
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
	
//	public static void main(String[] args) {
//		int[] arr = SortTool.getRandomArr(50000, 50000);
//		
//		arr = new BubbleSort().sort(arr);
//		
//		SortTool.print(arr);
//	}
}
