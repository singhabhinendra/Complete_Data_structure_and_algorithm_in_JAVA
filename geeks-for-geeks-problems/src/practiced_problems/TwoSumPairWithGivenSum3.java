/*
* Time Complexity: O(n*log(n)), for sorting the array
Auxiliary Space: O(1)
* The idea is to use the two-pointer technique but for using the two-pointer technique,
*  the array must be sorted. Once the array is sorted then we can use this approach by keeping
* one pointer at the beginning (left) and another at the end (right) of the array. Then check the sum of the elements at these two pointers:

        If the sum equals the target, we’ve found the pair.
        If the sum is less than the target, move the left pointer to the right to increase the sum.
        If the sum is greater than the target, move the right pointer to the left to decrease the sum.
* */
package practiced_problems;
import java.util.Arrays;
public class TwoSumPairWithGivenSum3 {
    static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                return true;
            }
            else if(sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TwoSumPairWithGivenSum3 obj = new TwoSumPairWithGivenSum3();
        int[] arr={0,-1,2,-3,1};
        int target=-2;

        if(obj.twoSum(arr,target)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
