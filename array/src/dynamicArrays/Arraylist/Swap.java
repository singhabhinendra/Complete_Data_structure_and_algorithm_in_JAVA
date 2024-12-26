package dynamicArrays.Arraylist;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        Swap swap1 = new Swap();
//        int[] arr= {1,2,34,45,23,78};
        int[] arr={23,12,11,10,2};
//        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
        swap1.reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
