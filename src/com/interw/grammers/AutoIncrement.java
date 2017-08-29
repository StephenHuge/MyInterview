package com.interw.grammers;

/**
 * 自增i++行为,输出结果是0.
 * 
 * 原因是:
 * 
 * @date 2017年8月29日 下午4:59:46
 */
public class AutoIncrement {
	public static void main(String[] args) {
		int i = 0;
		i = i++;
		System.out.println(i);
	}
}
