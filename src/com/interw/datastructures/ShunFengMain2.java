package com.interw.datastructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShunFengMain2 {


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
        
        
        Long num = in.nextLong();
        
        if(num < 0 )	return;
        String s = num.toString().trim();
        long ans = 2;
        
        
        if(s.length() > 1) {
        	for(int i = 2; i < s.length(); i++) {
        		ans += Math.pow(i, 2);
        	}
            if(Integer.parseInt(String.valueOf(s.charAt(0))) >= 7) {
            	ans += Math.pow(s.length(), 2);
            } else if(Integer.parseInt(String.valueOf(s.charAt(0))) >= 4) {
            	ans += s.length();
            }	
        }
        
        System.out.println(ans);
        
    }
}

