package com.interw.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class XieChengMain2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int findMinMis(int[] A) {
    	Arrays.sort(A);
    	
    	int left = 0, mid, right = A.length - 1;
    	int ans = 0;
    	int p = 0;
    	
    	while(true) {
    		mid = (left + right) / 2;
    		if(A[mid] < 0) {
    			left = mid + 1;
    		} else if(A[mid] > 0){
    			right = mid - 1;
    		} else {
    			p = mid;
    			break;
    		}
    		if(left == mid) {
    			p = left;
    			break;
    		}
    		if(right == mid) {
    			p = right;
    			break;
    		}
    	}
    	
    	ans = A[p]; 
    	if(ans > 1) return 1;
    	for(int i = p; i < A.length; i++) {
    		if(ans == 0) {
    			for(int j = i + 1; j < A.length; j++) {
    				ans++;
    				if(ans == A[j]) continue;
    				else {
    					ans = A[j];
    					break;
    				}
    			}
    		} 
    	}
    	return ans;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int res;
            
        int _A_size = 0;
        _A_size = Integer.parseInt(in.nextLine().trim());
        int[] _A = new int[_A_size];
        int _A_item;
        for(int _A_i = 0; _A_i < _A_size; _A_i++) {
            _A_item = Integer.parseInt(in.nextLine().trim());
            _A[_A_i] = _A_item;
        }
  
        res = findMinMis(_A);
        System.out.println(String.valueOf(res));    

    }
}
