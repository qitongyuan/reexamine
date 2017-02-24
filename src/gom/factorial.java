package gom;

import java.util.Scanner;

/**
 * 求N的阶乘
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num =scanner.nextInt();
            System.out.println(factorial(num));
        }
    }
    public static int factorial(int n){
        if (n>=2){
            return n * factorial(n-1);
        }else {
            return n;
        }
    }
}
