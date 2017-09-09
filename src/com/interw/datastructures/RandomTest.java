package com.interw.datastructures;

import java.util.Random;
/*
 * random.nextInt(max)表示生成[0,max]之间的随机数，然后对(max-min+1)取模。
 * 以生成[10,20]随机数为例，首先生成0-20的随机数，然后对(20-10+1)取模得到[0-10]之间的随机数，
 * 然后加上min=10，最后生成的是10-20的随机数
 */

public class RandomTest {
    public static void main(String[] args) {

    	double max = 360.00000000;
    	double min = 0.00000000;
    	System.out.println(100);
    	for (int i = 0; i < 100; i++) {
			
    		Random random = new Random();
    		
    		double s = random.nextDouble() * 1000 % (max - min + 1) + min;
    		
    		System.out.println(s);
		}
    }
}
