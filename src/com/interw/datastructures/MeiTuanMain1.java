package com.interw.datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class MeiTuanMain1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		
		int[] digits = new int[num];
		for(int i = 0; i < num; i++) {
			digits[i] = in.nextInt(); 
		}
		
		int len = digits.length;
		Object o = new Object();
		HashMap<String, Object> hm = new HashMap<>();
		
		String a = null;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if(i == j) continue;
				a = "" + digits[i] + digits[j];
				if(Long.parseLong(a) % 7 == 0)	
					hm.put(a, o);
			}
		}
		System.out.println(hm.size());
		System.out.println(hm);
		
		in.close();
	}
}
