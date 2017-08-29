package com.interw.datastructures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 腾讯笔试题
 * 题目：对于一颗满二叉排序树，其深度为K，结点数为2^K - 1个， 节点值为1 ~ 2^K - 1。
 * 给出K和任意三个节点值，输出包含三个结点的最小子树的根结点。
 * 
 * 样例输入： 4 10 15 13
 * 输出： 12
 * 
 * 思路： 满二叉排序树是结构十分固定的一种数据结构，如果知道了其层数，那么树的结构就确定了，之后我们可以针对其
 * 结构进行操作，最终找到合适的答案。
 * 
 *          8
 *        /   \
 *       4     12
 *      / \   /   \
 *     2  6   10   14
 *    /\  /\  / \ /  \
 *   1 3 5 7 9 11 13 15
 *
 * 树中的结点就是二分查找的顶点。
 * 如果输入的数中最大值比当前中点小，那么在当前中点的左子树中查找；
 * 如果输入的数中最小值比当前中点大，那么在当前中点的右子树中查找；
 * 
 * 
 * @Time 08/29
 */
public class FullBiOrderTree {
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int depth = s.nextInt();	//获取高度
		
		int first = s.nextInt();	//获取三个结点值
		int second = s.nextInt();
		int third = s.nextInt();
		
		int[] arr = {first, second, third};	//把三个节点值装入数组并进行排序
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length - 1]; 
		
		if(depth >= 32 || max > Math.pow(2, depth) - 1)	//最大值比depth深度的树最大值大，输入有误
			throw new Exception("非法的输入") ;
		
		int left = 1;
		int right = (int) (Math.pow(2, depth) - 1);
		int mid = (left + right) / 2;
		
		while(true) {
			if(max < mid) {		//如果最大值小于中点，则搜索中点的左子树
				right = mid - 1;
				mid = (left + right) / 2;
			} else if(min > mid) {	//如果最小值大于中点，则搜索中点的右子树
				left = mid + 1;
				mid = (left + right) / 2;
			}
			if(mid > min && mid < max) {	//中点既大于最小值，又小于最大值
				break;
			}
		}
		System.out.println(mid);
	}
}
