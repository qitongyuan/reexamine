package aom;

import java.util.Scanner;

/**
 * 实现字符的反转
 */
public class reversed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String string=scanner.next();
            System.out.println(string);
            System.out.println("反转后的字符串： "+reverse(string));
        }
    }
    public static String reverse(String string){
        char[] arr =string.toCharArray();
        for (int first=0, last=arr.length-1;first<last;first++,last--){
            char temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
        }
        return new String(arr);
    }
}
