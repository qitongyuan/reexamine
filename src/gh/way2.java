package gh;

import java.util.Scanner;

/**
 * n的阶乘 方法2
 */
public class way2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in)
;

        while (scanner.hasNext()){
            int num =scanner.nextInt();
            int flag=1;
            while (num!=1){
                flag=flag*num;
                num--;
            }
            System.out.println(flag);
        }
        scanner.close();
    }
}
