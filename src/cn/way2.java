package cn;

import java.util.Scanner;

/**
 * 输入年月日后判断这是今年第几天
 */
public class way2 {
    public static void main(String[] args) {
        int temp=0;
        int[] monthday=new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int year =scanner.nextInt();
            int month =scanner.nextInt();
            int day =scanner.nextInt();

            if (year%400==0||(year%4==0&&year%100!=0)){
                monthday[2]=29;
            }else {
                monthday[2]=28;
            }
            for (int i =1;i<month;i++){
                temp+=monthday[i];
            }
            temp+=day;
            System.out.println(temp);
        }
        scanner.close();
    }
}
