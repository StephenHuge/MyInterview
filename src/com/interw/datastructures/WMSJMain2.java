package com.interw.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class WMSJMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        
        int[][] map = new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                map[i][j] = in.nextInt();
            }
        }
        in.close();
        List<Integer> p = new ArrayList<>();
        int[][] paths = new int[row][col];  
        paths[0][0] = map[0][0];  
        
        for (int i = 1; i < row; i++) {  
            paths[i][0] = paths[i-1][0] + map[i][0];  
        }
        
        for (int i = 1; i < col; i++) {  
            paths[0][i] = paths[0][i-1] + map[0][i];  
        }  
          
        for (int i = 1; i < row; i++) {  
            for (int j = 1; j < col; j++) {  
                paths[i][j] = Math.max(paths[i][j-1], paths[i-1][j]) + map[i][j]; 
            }  
        }  
        
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(paths[i][j] + " ");
            }
            System.out.println();
        }
        addPath(p, row - 1, col - 1, paths);
        Collections.sort(p);
        int ans = p.get(0) >= 0 ? p.get(0) : -(p.get(0));
        System.out.println(ans);  
    }
    private static void addPath(List<Integer> p, int i, int j, int[][] paths) {
        if(i == 0 && j == 0) return;
        for(;j > 0 && i > 0; ) {
            if(paths[i - 1][j] >= paths[i][j - 1]) {
                p.add(paths[i - 1][j]);
                System.out.println("上" + paths[i - 1][j]);
                i--;
            } else {
                p.add(paths[i][j - 1]);
                System.out.println("左" + paths[i][j - 1]);
                j--;
            }
        }
        
        if(i == 0) {
            for(;j > 0; j--) {
                p.add(paths[0][j]);
                System.out.println("左左" + paths[0][j]);
            }
        }
        if(j == 0) {
            for(;i > 0; i--) {
                p.add(paths[i][0]);
                System.out.println("上上" + paths[i][0]);
            }
        }
    } 
    
}