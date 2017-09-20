package com.interw.datastructures;

import java.util.Scanner;

public class T360Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int len = in.nextInt();

		int[] nums = new int[len];

		for (int i = 0; i < len; i++) {
			nums[i] = in.nextInt();
		}
		
		int test = in.nextInt();
		int[] ans = new int[test];
		int count = 0;	//计时变量
		int times = 0;	//次数
		
		int l = 0, r = 0;
		int left = 0, mid = 0, right = 0;
		
		while(true) {
			if(count >= test - 1) break;
			l = in.nextInt();	//第一个下标
			r = in.nextInt();	//第二个下标
//			System.out.println("<<<<"+l);
//			System.out.println("<<<<"+r);
			if(r - l <= 1) {
				ans[count++] = 0;
				continue;
			}
			left = l;
			mid = l + 1;
			right = l + 2;
			
			if(nums[left - 1] < nums[mid - 1] && nums[mid - 1] < nums[right - 1]) {
				//System.out.println(">>>" + nums[left - 1]);
				times++;
			}
			while(++right <= r) {
				left++;
				mid++;
				if(nums[left - 1] < nums[mid - 1] && nums[mid - 1] < nums[right - 1]) {
					times++;
				}
			}
			ans[count++] = times; 
		}
		
		for (int i : ans) {
			System.out.println(i);
		}
	}
}
