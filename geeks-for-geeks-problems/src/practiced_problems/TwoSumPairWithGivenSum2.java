/*Time Complexity: O(n*log(n)), for sorting the array
Auxiliary Space: O(1)
[Better Approach 1] Sorting and Binary Search – O(n*log(n)) time and O(1) space

    We can also solve this problem using Binary Search.
     As we know that searching element in sorted array would take O(log(n)) time.
      We first sort the array. Then for each number arr[i] in the array, we first calculate
      its complement (i.e., target – current number) then uses binary search to quickly check if
       this complement exists in the subarray after index i. If we find the complement, we returns true;
        If we never find a complement (after checking all numbers), we return false.


*/
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
