package com.interw.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class XiaoMiMain1 {
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
			str = strs.get(i);
			sb = new StringBuffer();
			sb.append("_");
			//			System.out.println("get" + str);
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '.') {
					sb.append("_");//如果是点加_
					continue;
				} 
				else if(j < str.length() - 1) {	//在中间就进行判断
					if(Character.isLowerCase(str.charAt(j)) && 
							Character.isUpperCase(str.charAt(j + 1))) {	//aA >> A_A
						sb.append(Character.toUpperCase(str.charAt(j)));
						sb.append("_");
					} 
					else if(j > 0 ) {
						if( Character.isUpperCase(str.charAt(j - 1)) &&	//STa >> S_TA
								Character.isUpperCase(str.charAt(j)) && 
								Character.isLowerCase(str.charAt(j + 1))) {
							sb.append("_");
							sb.append(Character.toUpperCase(str.charAt(j)));
						} else if(Character.isDigit(str.charAt(j)) &&
								(str.charAt(j - 1)>='A' && str.charAt(j - 1)<='Z'  ||
								str.charAt(j - 1)>='a' && str.charAt(j - 1)<='z')) //a2 >> A_2) {
							{sb.append("_");
							sb.append(str.charAt(j));
						} else if(Character.isDigit(str.charAt(j - 1)) &&
								(str.charAt(j)>='A' && str.charAt(j)<='Z'  ||
								str.charAt(j)>='a' && str.charAt(j)<='z')) //2a >> 2_A
								 {
							sb.append("_");
							sb.append(Character.toUpperCase(str.charAt(j)));
						}
						else {
							sb.append(Character.toUpperCase(str.charAt(j)));
						}
					} else {
						sb.append(Character.toUpperCase(str.charAt(j)));
					}
				} else {
					sb.append(Character.toUpperCase(str.charAt(j)));
				}
			}
			sb.append("_");
			strs.remove(i);
			strs.add(i, sb.toString());

		}
		for(String s : strs)
			System.out.println(s);
		in.close();
	}
}

