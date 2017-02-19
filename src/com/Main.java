package com;
/**
 * 输入年月日后判断这是今年第几天
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int year=scanner.nextInt();
            int  month=scanner.nextInt();
            int day =scanner.nextInt();
            for (int i=1;i<month;i++){
                day+=getday(year,i);
            }
            System.out.println(day);
        }
    }

    public static int getday(int year,int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year%400==0||(year%4==0&&year%100!=0)){
                    return 29;
                }else {
                    return  28;
                }
                default:
                    return 30;
        }
    }

}
