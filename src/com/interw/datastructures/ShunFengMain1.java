package com.interw.datastructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShunFengMain1 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int[] solve(int[] a) {
    	if(a == null || a.length == 0)	return null;
    	int[] ans = new int[a.length];
    	int temp = 0;
    	for(int i = ans.length - 1; i >= 0; i--) {
    		temp = a[i];
    		for(int j = i + 1; j < a.length; j++) {
    			
    			temp += ans[j] * Math.pow(-1, j - i + 1);
    		}
    		ans[i] = temp;
    	}
    	return ans;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;
            
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }
  
        res = solve(_a);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}

