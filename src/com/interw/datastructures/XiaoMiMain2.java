package com.interw.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XiaoMiMain2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<String> strs = new ArrayList<>();

		while(in.hasNextLine()) {
			String str = in.nextLine();
			if (str.equals("")) {  
				break;  
			}  
			strs.add(str);  
		}

		String str = null;
		StringBuffer sb = null;
		for(int i = 0; i < strs.size(); i++) {
			
			
		}
		in.close();
	}
}
