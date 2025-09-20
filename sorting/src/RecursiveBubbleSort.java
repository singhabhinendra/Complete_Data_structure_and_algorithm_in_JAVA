import java.util.*;
public class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr,int n) {
        if(n==1) return;
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        //Range reduced after recursion:
        bubbleSort(arr,n-1);
    }
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
