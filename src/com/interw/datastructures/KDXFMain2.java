package com.interw.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class KDXFMain2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();	//��������
		
		String[] teams = new String[num];
		int count = 0;
		while(count < num) {
			teams[count] = in.next();
			count++;
		}
		int times = num * (num - 1) / 2;
		HashMap<String, Goal> hs = new HashMap<>();
		String first = null;
		String second = null;
		Integer fG = 0;
		Integer sG = 0;
		Goal g = new Goal();
		
		for(int i = 0; i < times; i++) {
			String[] joiners = in.next().split("-");
			
			first = joiners[0];
			second = joiners[1];
			String[] status = in.next().split(":");
			
			fG = Integer.parseInt(status[0]);	//������
			sG = Integer.parseInt(status[1]);
			
			
			if(fG > sG) {
				if((g = hs.get(first)) == null) {
					g = new Goal();
				}
				g.grade += 3;	//����
				g.times += fG;	//������
				hs.put(first, g);
				if((g = hs.get(second)) == null) {g = new Goal();}
				g.times += sG;
				hs.put(second, g);
			} else if(fG < sG) {
				if((g = hs.get(second)) == null) {
					g = new Goal();
				}
				g.grade += 3;
				g.times += sG;
				hs.put(second, g);
				
				if((g = hs.get(first)) == null) {
					g = new Goal();
				}
				g.times += fG;
				hs.put(first, g);
			} else {
				if((g = hs.get(first)) == null) {
					g = new Goal();
				}
				g.grade += 1;
				g.times += fG;
				hs.put(first, g);
				
				if((g = hs.get(second)) == null) {g = new Goal();}
				g.grade += 1;
				g.times += sG;
				hs.put(second, g);
			}
		}
		//System.out.println(hs);
		
		List<Map.Entry<String,Goal>> list = new ArrayList<Map.Entry<String,Goal>>(hs.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Goal>>() {
            //��������
            public int compare(Entry<String, Goal> o1,
                    Entry<String, Goal> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        });
        for(int i = 0; i < list.size() / 2; i ++) {
        	System.out.println(list.get(i).getKey());
        }
        
        in.close();
	}
	
	public static class Goal implements Comparable<Goal>{
		int grade;	//����
		int times;	//������
		@Override
		public String toString() {
			return "Goal [grade=" + grade + ", times=" + times + "]";
		}
		@Override
		public int compareTo(Goal o) {
			if(o.grade > grade)
				return 1;
			else if(o.grade < grade)
				return -1;
			else {
				if(o.times > times)	return 1;
				else if(o.times < times)	return -1;
				else return 0;
			}
		}
	}
}
