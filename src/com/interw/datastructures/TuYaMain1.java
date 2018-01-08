package com.interw.datastructures;

import java.util.Scanner;

/**
 * 输入一个不大于400的整数，计算从2017年开始，整数个年份中每个月17号周一到周日的次数
 */
public class TuYaMain1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个不大于400的正整数：");
        int num = in.nextInt();    
        in.close();
        countWeek(num);
    }

    private static void countWeek(int num) throws Exception {
        if(num <= 0 || num > 400) throw new Exception("输入有误!");
        int[] daysOfYear = {    // 每年每月的天数
                31,28,31,30, 
                31,30,31,31,
                30,31,30,31};

        int year = 2017;    // 第一年
        int day = 2;        // 第一个月的星期值
        int[] count = new int[7];   // 存放结果的数组

        for(; year <= 2017 + num - 1; year++) {
            daysOfYear[1] = year % 4 == 0 ? 29 : 28;    // 判断是否是闰年
            
            for(int m = 1; m <= 12; m++) {
                int a = day % 7;
//                System.out.println(year + "年" + m + "月17号是周 " + a);
                count[a]++;
                day += daysOfYear[m - 1];
            }
            
        }
        int end =  2017 + num - 1;
        System.out.println("2017年到" + end + "年每个月的17号的分布如下：");
        for(int i = 1; i <= count.length; i++) {
            if(i != 7) {
                System.out.println("星期" + i + "的天数是：" + count[i - 1]);
            } else {
                System.out.println("星期日"+ "的天数是：" + count[i - 1]);
            } 
        }
    }
}

