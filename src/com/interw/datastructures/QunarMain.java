package com.interw.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 田忌和齐王赛马，两人各有n匹马，输入第1行是田忌的赛马速度，第2行是齐王的，
 * 分别是两个无序正整数组给出，数字越大代表越快。齐王的赛马出场顺序总是从快到慢，
 * 问:田忌合理安排顺序后，最多能赢几场比赛?(注意：速度相同不算赢)
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

