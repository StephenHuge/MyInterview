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
			quickSort(arr, left, point);	//��ߵݹ�����
			quickSort(arr, point + 1, right);	//�ұߵݹ�����
		}
		return arr;
	}

	private int quickAdjust(int[] arr, int left, int right) {
		int pivot = arr[left];
		
//		int[] pivots = {arr[left], arr[right], arr[(left + right) / 2]};	//ȷ�����õ�pivot�������������
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
		
		long startTime=System.nanoTime();   //����ʼʱ��  
		new QuickSort().sort(arr);
		long endTime=System.nanoTime(); //����ʱ��  

		SortTool.print(arr);
		System.out.println("��������ʱ��Ϊ "+(double)((endTime-startTime)) / 1000000000 +"s");
	}
}
