package dynamicArrays.Arraylist;

import java.util.Arrays;

public class MaximumItemInAL {
    public static void main(String[] args){
        int[] arr= {1,2,34,45,23};
        System.out.println(maxElement(arr));
        System.out.println(maxRange(arr,1,3));

    }
    public static int maxRange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max=arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            };
        }
        return max;
    }
    public static int maxElement(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            };
        }
        return max;
    }
}
