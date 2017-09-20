package com.interw.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class T360Main1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        int maxMinutes = in.nextInt();
        
        int[] arr = new int[num];
        
        for(int i = 0; i < num; i++) {
        	arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.println(getMax(arr, maxMinutes));
    }
    
    public static int getMax(int[] arr, int max) {
    	int sum = 0;
    	for(int i = 0; i < arr.length; i++) {
				if(sum < max) {
					sum += arr[i];
				}
    	}
    	return sum;
    }
}

