package com.interw.datastructures;

import java.util.Scanner;
/**
 * 
 */
public class TouTiaoMain1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();		//���ӵ�����
		int times = in.nextInt();	//��ɫ�����ظ�������
		int colors = in.nextInt();	//һ���ж�����ɫ
		int[] broken = new int[colors + 1];		//�ظ����ӵ�����

		int[][] balls = new int[num][colors + 1];

		for(int i = 0; i < num; i++) {	//��num������
			while(in.hasNext()) {	//�洢ÿ�����ӵ���ɫ
				int cNum = in.nextInt();	//ÿ�����ӵ���ɫ

				balls[i][0] = cNum; 
				for(int j = 1; j < cNum + 1; j++) {
					balls[i][in.nextInt()] = 1;	//�洢ÿ�����ӵ���ɫ
				}
				break;
			}	
		}

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < times; j++) {
				for (int j2 = 1; j2 < colors + 1; j2++) {
					if(broken[j2] == 1)		continue;
					if(i + j >= num) {
						if(balls[i][j2] != 0 && balls[i][j2] == balls[i + j - num][j2]) {
							broken[j2] = 1;
						} 
					} else if(balls[i][j2] != 0 && balls[i][j2] == balls[i + j][j2]) {
						broken[j2] = 1;
					} 
				}
			}
		}
		int count = 0;
		for (int i = 0; i < balls.length; i++) {
			for (int j = 0; j < balls[0].length; j++) {
				System.out.print(balls[i][j]);
			}
			System.out.println();
		}
		
		for(int k = 0; k < colors + 1; k++) {
			System.out.print(broken[k] + " ");
			if(broken[k] == 1)
				count++;
		}
		System.out.println(count);
	}
}

