package practiced_problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class AllocateMinimumPages {
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }

        int minPageLimit = Arrays.stream(arr).max().getAsInt();
        int maxPageLimit = Arrays.stream(arr).sum();

        for(int i = minPageLimit ; i<= maxPageLimit ; i++){
            if(check(arr,k,i))
                return i;
        }

        return -1;
    }
    public static boolean check(int[] arr, int k, int pageLimit){
        int count=1;
        int pageSum =0;
        for( int i=0 ; i< arr.length;i++){
            if(pageSum + arr[i] > pageLimit){
                count++;
                pageSum = arr[i];
            }
            else{
                pageSum+= arr[i];
            }
        }
        return (count<=k);
    }
    public static void main(String[] args){
        AllocateMinimumPages allocateMinimumPages = new AllocateMinimumPages();
        System.out.println(allocateMinimumPages.findPages(new int[]{12,34,67,90}, 2));
    }
}
