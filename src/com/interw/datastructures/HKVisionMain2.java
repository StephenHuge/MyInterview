package com.interw.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HKVisionMain2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		String[] branches = s.split(";");
		
		String[] branch = null;
		List<Branch> brans = new LinkedList<>();
		
		for(String ss : branches) {
			branch = ss.split(",");	//ÿ������
			if(branch == null || branch.length != 3) {
				System.out.println("incorrect data");
				in.close();
				return;
			}
			brans.add(new Branch(
							Integer.parseInt(branch[0]),
							branch[1],
							Integer.parseInt(branch[2])
						)
					);
		}
//		StringBuffer output = new StringBuffer();
		
		in.close();
	}
	
	public static class Branch {
		int id;
		String name;
		int upId;
		
		public Branch(){}
		public Branch( int id, String name,int upId){
			this.id = id;
			this.name = name;
			this.upId = upId;
		}
	}
}
