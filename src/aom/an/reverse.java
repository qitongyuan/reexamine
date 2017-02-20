package aom.an;

import java.util.Scanner;

/**
 * 字符反转
 */
public class reverse {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        stringBuffer.append(scanner.next());
        stringBuffer.reverse();
        System.out.println("反转后:"+stringBuffer);
    }
}
