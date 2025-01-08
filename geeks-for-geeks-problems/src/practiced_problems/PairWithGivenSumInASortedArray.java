package practiced_problems;

import java.util.Arrays;

public class PairWithGivenSumInASortedArray {
    static int pairSum(int[] arr, int target) {
        int count=0;
        int left=0,right=arr.length-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                count+=1;
            }
            else if(sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {-1,1,5,5,7 };
        int target = 3;
        System.out.println(pairSum(arr, target));
    }
}
