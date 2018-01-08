package com.interw.datastructures;

import java.util.ArrayList;
import java.util.Scanner;
public class MoGuJieMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int year, month, day;
        
        ArrayList<Date> dates = new ArrayList<>();
        
        Date d = new Date();
        while(true) {
        	d.year = in.nextInt();
        	d.month = in.nextInt();
        	d.day = in.nextInt();
        	dates.add(d);
//        	System.out.println("jaja");
        	String nextLine = in.nextLine();
            if (nextLine == null || nextLine.trim().length() == 0) 
//                System.out.println("empty, break.");
                break;
        }
        for(Date date : dates) 
        	System.out.println(count(date));
        
    }
    
    public static int count(Date d) {
    	 int[] days = {
    	        	31,28,31,30, 
    	        	31,30,31,31,
    	        	30,31,30,31	
        }; 
        int ans = 0;
        if(d.year % 4 == 0) {
        	days[1] = 29;
        }
        int i ;
        for(i = 0; i < d.month; i ++) {
        	ans += days[i];
        }
//        System.out.println(ans+ ">>");
        ans = ans - days[i - 1] + d.day;
        return ans;
    }
    
    static class Date {
    	int year, month, day;
    }
}
