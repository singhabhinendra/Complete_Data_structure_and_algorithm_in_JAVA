package practiced_problems;

import java.util.HashSet;

public class TwoSumPairWithGivenSum4 {
    static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int complement= target -arr[i];
            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
