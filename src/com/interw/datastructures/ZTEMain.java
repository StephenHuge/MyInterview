package com.interw.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 搜狗在线笔试题.
 * 给定一组数，是圆中的角度，大小在0~360之间，精度为小数点后8位，每两个角度之间的劣弧即为其长度，求长度最大值。
 * @author 40741
 *
 */
public class ZTEMain {
	public static void main(String[] args) throws Exception {
		
		
		List<Double> doubles = new ArrayList<>();
		int num = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String buffer = null;

		if((buffer = br.readLine()) != null){
			num = Integer.valueOf(buffer);
		}
		
		while(true) {
			buffer = br.readLine();
			if(buffer == null || buffer.equals(""))
				break;
			double angle = Double.valueOf(buffer);
			if(angle < 0.00000000 || angle > 360.00000000) {
				return;
			}
			doubles.add(angle);		//添加到ArrayList
			System.out.println(angle);
		}
		doubles.sort(null);
		
		long startTime=System.nanoTime();   //程序开始时间  
			
		double max = 0.00000000;
		double max2 = 0.00000000;
		double temp = 0.00000000;
		int x = 0;
		
		for(int i = 0; i < doubles.size() - 1; i++) {
			for(int j = x + 1; j < doubles.size(); j++) {
				if((temp = doubles.get(j) - doubles.get(i)) > 180.00000000) {
					temp = 360.00000000- temp;
					if(temp > max) {
						max = temp;
						x = j;
					}
					break;
				}
				if(temp > max) {
					max = temp;
					x = j;
				}
			}
			if(max2 < max) {
				max2 = max;
				}
		}
		
		System.out.println(String.format("%.8f", max2));
		
		long endTime=System.nanoTime(); //结束时间  

		System.out.println("程序运行时间为 "+(endTime-startTime)+"ns"); 
	}
}


