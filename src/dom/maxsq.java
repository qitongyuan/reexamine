package dom;

import java.util.Scanner;

/**
 * 输出最大序列和
 */
public class maxsq
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int sum = 0;
            int max = arr[0];
            for (int i=0;i<n;i++) {
                sum += arr[i];
                if (sum > max) {
                    max = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            System.out.println("最大值：" + max);
        }
            scanner.close();
    }
}
