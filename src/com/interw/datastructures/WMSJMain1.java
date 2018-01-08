package com.interw.datastructures;

import java.util.Arrays;
import java.util.Scanner;
public class WMSJMain1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kinds = in.nextInt();
        int[] k = new int[kinds];
        for (int i = 0; i < kinds; i++) {
            k[i] = in.nextInt();
        }
        int price = in.nextInt();
        in.close();
        Arrays.sort(k);
        
        int ans = 0;
        for (int i = k.length - 1; i > 0; i--) {
            if ((ans = price / k[i]) == 0) continue;
            
            
        }
        
        System.out.println(ans);
    }
}
