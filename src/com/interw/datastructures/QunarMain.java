package com.interw.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ��ɺ������������˸���nƥ�������1������ɵ������ٶȣ���2���������ģ�
 * �ֱ����������������������������Խ�����Խ�졣�������������˳�����Ǵӿ쵽����
 * ��:��ɺ�����˳��������Ӯ��������?(ע�⣺�ٶ���ͬ����Ӯ)
 */
public class QunarMain {
	public static void main(String[] args) {
		List<Integer> tianJi = new ArrayList<>();
		List<Integer> kingQi = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt() && s.next() != null && !s.next().equals("")) {
			tianJi.add(s.nextInt());
		}
		
		kingQi = tianJi.subList(tianJi.size() / 2, tianJi.size() - 1);
		tianJi = tianJi.subList(0, tianJi.size() / 2);
		
		System.out.println(tianJi);
		System.out.println(kingQi);
	}
}

