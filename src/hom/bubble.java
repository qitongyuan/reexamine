package hom;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 冒泡排序法（bubble sort）
 算法思想：(将相邻两个数比较，小的调到前头)
 有n个元素（存放在数组a(n)中），第一趟将每相邻两个元素比较，小的调到前头，经n-1次两两相邻比较后，最大的元素已“沉底”，放在最后一个位置，小数上升“浮起”；
 第二趟对余下的n-1个元素（最大的元素已“沉底”）按上法比较，经n-2次两两相邻比较后得次大的元素；
 依次类推，n个元素共进行n-1趟排序，  在第j 趟中要进行n-j次两两比较。
 */
public class bubble {
    public static void main(String[] args) {
        int[] arr={2,5,10,8,1};

        for (int j=0;j<arr.length-1;j++){
            for (int i=0;i<arr.length-1-j;i++){
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("数组元素"+ Arrays.toString(arr));

    }
}






