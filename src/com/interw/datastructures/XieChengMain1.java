package com.interw.datastructures;

import java.util.Scanner;

public class XieChengMain1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int fLen = in.nextInt();
		int[] fArr = new int[fLen];

		for(int i = 0; i < fLen; i++) {
			fArr[i] = in.nextInt();
		}
		int sLen = in.nextInt();
		int[] sArr = new int[sLen];

		for(int i = 0; i < sLen; i++) {
			sArr[i] = in.nextInt();
		}
		/*----------------------*/
		int count = 0;
		int p1 = 0, p2 = 0, p = 0;
		int[] ans = new int[fLen + sLen];

		while(p1 <= fArr.length - 1 && p2 <= sArr.length - 1) {
			if(fArr[p1] <= sArr[p2]) {
				ans[p] = fArr[p1];
				if(fArr[p1] == sArr[p2]) {
					p2++;
					count++;
				}	
				p++;
				p1++;
			} else {
				ans[p++] = sArr[p2++];
			}
		} 

		while(p1 <= fArr.length - 1) {
			ans[p++] = fArr[p1++];
//			System.out.println("haha" + p1);
		}
		while(p2 <= sArr.length - 1) {
			ans[p++] = sArr[p2++];
//			System.out.println("jaja" + p2);
		} 
//		for(int i = 0; i < ans.length; i++) {
//			System.out.print(ans[i] + " ");
//		}
		int result = ans.length - count;
		float da = 1;
//		System.out.println(result);
		if(result % 2 != 0)	da = ans[result / 2];
		else da = (float)(ans[result / 2 - 1] + ans[result / 2]) / 2;
		System.out.println(da);

		in.close();
	}
}
