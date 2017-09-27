package com.interw.datastructures;

import java.util.Scanner;

public class TuYaMain2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        String id = in.nextLine();
        if(id == null || id.length() != 18) {
            in.close();
            throw new Exception("非法输入！");
        }
        
        int length = in.nextInt();
        String[] regionArry = new String[length];
        for(int i = 0; i < length; i++) {
            regionArry[i] = in.next();
        }
        in.close();
        String gender = verify(id, regionArry);  // 性别结果
        System.out.println(gender);
    }
    private static String verify(String id, String[] regionArry) {
        String gender = null;
        String IDCard = id;
        String[] districts = regionArry;

        String district = IDCard.substring(0, 6);
        String birth = IDCard.substring(6, 14);
        String orderCode = IDCard.substring(14, 17);
        String check = IDCard.substring(17);

        if(checkDistrict(districts, district)   // 判断地区是否正确 
                && checkBirth(birth)            // 判断生日是否正确
                && (gender = getGender(orderCode)) != null // 判断性别是否正确
                && getCheckVal(IDCard, check)   // 检验校验值是否正确
                ) 
            return gender;
        else
            return "输入错误";
    }
    /**
     * 检验校验值是否正确
     */
    private static boolean getCheckVal(String IDCard, String check) {
        int c = 0;  // 最后一位校验码
        if(check.equals("X"))   c = 10;
        else    
            c = Integer.parseInt(check);

        long cal = c, multiplier = 2;
        // 判断校验值是否正确
        for(int i = 0; i < 17; i++) {
            char c1 = IDCard.charAt(i);
            int c2 = Integer.parseInt(new String(c1 + ""));
            cal += c2 * (multiplier << (17 - i - 1));   // 累加
        }
        if(cal % 11 == 1) return true;
        return false;
    }

    /**
     * 判断性别是否正确并取得性别
     */
    private static String getGender(String orderCode) {
        String ans = null;
        int order = Integer.parseInt(orderCode);
        if(order == 0 ) return null;    // 如果顺序码为0则返回空

        ans = order % 2 == 0 ? "Female" : "Male";   // 偶数为女性，奇数为男性
        return ans;
    }

    /**
     * 判断生日是否正确
     */
    private static boolean checkBirth(String birth) {
        int[] daysOfYear = {    // 每年每月的天数
                31,28,31,30, 
                31,30,31,31,
                30,31,30,31};
        int year = Integer.parseInt(birth.substring(0, 4));
        int month = Integer.parseInt(birth.substring(4, 6));
        int day = Integer.parseInt(birth.substring(6, 8));

        boolean leapYear = year % 4 == 0;
        daysOfYear[1] =  leapYear ? 29 : 28;    // 处理是否是闰年

        if(year < 1900 || year > 2011) return false;    // 判断年份
        if(month < 0 || month > 12) return false;       // 判断月份
        if(day < 0 || day > daysOfYear[month - 1]) return false;    // 判断每月的天数
        return true;
    }

    /**
     * 判断地区是否正确 
     */
    private static boolean checkDistrict(String[] districts, String district) {
        boolean ans = false;
        for(int i = 0; i < districts.length; i++) {
            if(district.equals(districts[i])) {
                ans = true;     
                break;
            }
        }
        return ans;
    }
}
