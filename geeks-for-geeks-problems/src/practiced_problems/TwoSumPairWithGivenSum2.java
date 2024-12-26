package practiced_problems;

import java.util.Arrays;

public class TwoSumPairWithGivenSum2 {
    static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length ; i++) {
            int complement = target - arr[i];
            if(binarySearch(arr,i+1,arr.length-1,complement))
                return true;

        }
        return false;
    }
    private static boolean binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid=start + (end - start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] > target) {
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if (twoSum(arr, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
