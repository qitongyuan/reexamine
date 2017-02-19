package ch;

import java.util.Scanner;

/**
 * Created by QTY on 2017/2/19.
 */
public class way3 {
    public static void main(String[] args) {
        int temp = 0;
        int[] monthday = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int y = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();

            for (int i = 1; i < m; i++) {
                temp += monthday[i];
            }
            temp += d;
            while ((y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) && m > 3) {
                temp += 1;
            }
            System.out.println(temp);
        }
        scanner.close();

    }
}
