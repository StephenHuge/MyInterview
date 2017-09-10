package com.interw.datastructures;

import java.util.Scanner;
public class TouTiaoMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        int[] likes = new int[num];
        
        int p = 0;
        while(in.hasNext()) {
        	likes[p++] = in.nextInt();
        	if(p >= num) break;
        }
        
        int c = in.nextInt();
        int[][] users = new int[c][3];
        
        for(int i = 0; i < c; i++) {	
			while(in.hasNext()) {	
				for(int j = 0; j < 3; j++) {
					users[i][j] = in.nextInt();	
				}
				break;
			}	
		}
     
        int[] cc = new int[c];
        for (int i = 0; i < c; i++) {
			for (int j = users[i][0]; j <= users[i][1]; j++) {
				if(likes[j - 1] == users[i][2])
					cc[i]++;
			}
			System.out.println(cc[i]);
		}
        
//        for (int i = 0; i < users.length; i++) {
//			for (int j = 0; j < users[0].length; j++) {
//				System.out.print(users[i][j]);
//			}
//			System.out.println();
//		}
//        for (int i = 0; i < likes.length; i++) {
//			System.out.println(likes[i]);
//		}
    }
}
