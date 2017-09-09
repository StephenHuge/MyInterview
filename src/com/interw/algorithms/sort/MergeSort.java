package com.interw.algorithms.sort;

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
	
	/*void mergeArray(int a[], int first, int mid, int last, int temp[])  
	{  
	    int i = first, j = mid + 1;  
	    int m = mid,   n = last;  
	    int k = 0;  
	      
	    while (i <= m && j <= n)  
	    {  
	        if (a[i] <= a[j])  
	            temp[k++] = a[i++];  
	        else  
	            temp[k++] = a[j++];  
	    }  
	      
	    while (i <= m)  
	        temp[k++] = a[i++];  
	      
	    while (j <= n)  
	        temp[k++] = a[j++];  
	      
	    for (i = 0; i < k; i++)  
	        a[first + i] = temp[i];  
	}  
*/
	public static void main(String[] args) {
//		int[] former = {3, 4, 9, 10, 15, 2, 7, 8, 11};
//		int[] former = {3, 4, 9, 10, 15, 2, 7, 8, 11};
//		int[] former = {7,6,8};
		int[] former = SortTool.getRandomArr(50, 50);
		int[] latter = new int[former.length];

		int mid = (0 + former.length - 1) / 2;
		SortTool.print(former);
//		int[] ans = new MergeSort().mergeArray(former, 0 ,mid, former.length - 1, latter);
		new MergeSort().mergeSort(former, 0, former.length - 1, latter);
//		int[] ans = new MergeSort().sort(former);

		SortTool.print(latter);
	}

}

/*sorted = new int[former.length + latter.length];

		int pivot = 0, f = 0, l = 0;

		while(f < former.length && l < latter.length && pivot < sorted.length) {
			if(f < former.length && l < latter.length && pivot < sorted.length 
					&& former[f] <= latter[l]) {
				sorted[pivot] = former[f];
				pivot++;
				f++;
			}
			if(f < former.length && l < latter.length && pivot < sorted.length 
					&& former[f] > latter[l]) {
				sorted[pivot] = latter[l];
				pivot++;
				l++;
			}
		}
		if(f < former.length && l >= latter.length) {
			while(f < former.length) {
				sorted[pivot] = former[f];
				pivot++;
				f++;
			}
		} else {
			while(l < latter.length) {
				sorted[pivot] = latter[l];
				pivot++;
				l++;
			}
		}*/
/*int l = left, m = mid + 1, pivot = left;

		while(l < (mid + 1) && m < (right + 1) && pivot < sorted.length) {
			if(left == mid || m == right) break;
			if(l < mid && m < right + 1 && pivot < sorted.length && unSort[l] <= unSort[m]) {
				sorted[pivot++] = unSort[l++];
			}
			if(l < (mid + 1) && m < (right + 1) && pivot < sorted.length && unSort[l] > unSort[m]) {
				sorted[pivot++] = unSort[m++];
			}
			
			if(l < (mid + 1) && m >= (right + 1)) {
				while(l < (mid + 1)) {
					sorted[pivot++] = unSort[l++];
				}
			} else if(l >= (mid + 1) && m < (right + 1)){
				while(m <= (right + 1)) {
					sorted[pivot++] = unSort[m++];
				}
			}
		}*/