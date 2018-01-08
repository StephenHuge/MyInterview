package com.interw.datastructures;

import java.util.LinkedList;
import java.util.Scanner;

public class SougouMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String path = in.next();
		if(path == null || path.length() == 0) {
			in.close();
			return;
		}
		LinkedList<String> stack = new LinkedList<>();
		
		String[] str = path.split("/");
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("")|| str[i].equals(".")) {
				continue;	
			}else
			
			if(str[i].equals("..")) {
				if(stack.size() > 0)
					stack.pollLast();
			} else {
				stack.add(str[i]);
			}
			
			
		}
		StringBuffer sf = new StringBuffer();
		
		for(String s : stack) {
			if(!s.equals(null)) {
				sf.append("/");
				sf.append(s);
			}
		}
		
		System.out.println(sf.toString());
		
		in.close();
	}
	
}
