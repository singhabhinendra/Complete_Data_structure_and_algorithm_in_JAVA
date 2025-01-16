package Subarray.resources;

import java.util.Arrays;

public class PrintMaxSuArr {
    public static void printSubArray(int[] arr){
        int n=arr.length;
        for(int sp=0;sp<n;sp++){
            for(int ep=sp;ep<n;ep++){
                for(int i=sp;i<ep;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        PrintMaxSuArr printMaxSuArr = new PrintMaxSuArr();
        printSubArray(new int[]{1,2,3,4,5});
    }
}
