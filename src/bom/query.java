package bom;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 成绩查询
 */
public class query {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n =scanner.nextInt();
            scanner.nextInt();
            HashMap<String,String>hashMap=new HashMap<>();
            for (int i=0;i<n;i++){
                String string=scanner.nextLine();
                hashMap.put(string.split(" +",2)[0],string);
            }
            int m=scanner.nextInt();
            for (int i=0;i<m;i++){
                String key=scanner.next();
                if (hashMap.containsKey(key)){
                    System.out.println(hashMap.get(key));
                }else {
                    System.out.println("没有结果!");
                }
            }
        }
    }
}
