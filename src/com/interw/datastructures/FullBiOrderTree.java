package com.interw.datastructures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��Ѷ������
 * ��Ŀ������һ���������������������ΪK�������Ϊ2^K - 1���� �ڵ�ֵΪ1 ~ 2^K - 1��
 * ����K�����������ڵ�ֵ�������������������С�����ĸ���㡣
 * 
 * �������룺 4 10 15 13
 * ����� 12
 * 
 * ˼·�� �������������ǽṹʮ�̶ֹ���һ�����ݽṹ�����֪�������������ô���Ľṹ��ȷ���ˣ�֮�����ǿ��������
 * �ṹ���в����������ҵ����ʵĴ𰸡�
 * 
 *          8
 *        /   \
 *       4     12
 *      / \   /   \
 *     2  6   10   14
 *    /\  /\  / \ /  \
 *   1 3 5 7 9 11 13 15
 *
 * ���еĽ����Ƕ��ֲ��ҵĶ��㡣
 * ���������������ֵ�ȵ�ǰ�е�С����ô�ڵ�ǰ�е���������в��ң�
 * ��������������Сֵ�ȵ�ǰ�е����ô�ڵ�ǰ�е���������в��ң�
 * 
 * ��������� 5 24 28 30 ����е㼴Ϊ���ֵ������Сֵ������������ж������ѭ������
 * 
 * @Time 08/29
 */
public class FullBiOrderTree {
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int depth = s.nextInt();	//��ȡ�߶�
		
		int first = s.nextInt();	//��ȡ�������ֵ
		int second = s.nextInt();
		int third = s.nextInt();
		
		int[] arr = {first, second, third};	//�������ڵ�ֵװ�����鲢��������
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length - 1]; 
		
		//��ȳ���intֵ���ֵ�������ֵ��depth��ȵ������ֵ����������
		if(depth >= 32 || max > Math.pow(2, depth) - 1) {
			s.close();
			throw new Exception("�Ƿ�������") ;
		}	
		
		int left = 1;	//����������С��ֵ
		int right = (int) (Math.pow(2, depth) - 1);	//������������ֵ
		int mid = (left + right) / 2;	//�������ĸ��ڵ�ֵ
		
		while(true) {
			if(max < mid) {		//������ֵС���е㣬�������е��������
				right = mid - 1;
				mid = (left + right) / 2;
			} else if(min > mid) {	//�����Сֵ�����е㣬�������е��������
				left = mid + 1;
				mid = (left + right) / 2;
			}
			//�е�ȴ�����Сֵ����С�����ֵ �������ֵ����СֵΪ�е�
			if(mid > min && mid < max || mid == max || mid == min) {	
				break;
			}
		}
		System.out.println(mid);
		
		s.close();
	}
}
