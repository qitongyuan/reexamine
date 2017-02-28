package hh;

/**
 * 折半查找法(二分法)
 */
public class binary {
    public static void main(String[] args) {
        int[] arr={12,13,17,19,30};
        int index=halfserach(arr,12);
        System.out.println(index);
    }
    public static int halfserach(int[] arr,int target){
        int max=arr.length-1;
        int min=0;
        int mid=(max+min)/2;

        while (true){
            if (target>arr[mid]){
                min=mid+1;
            }else if (target<arr[mid]){
                max=mid-1;
            }else {
                return mid;
            }
            mid=(min+max)/2;
            if (max < min) {
                return -1;
            }
        }
    }
}
