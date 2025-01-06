package practiced_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumClosestToTarget {
    public static List<Integer> sumClosest(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer> res=new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        int left=0,right=n-1;
        while(left<right){
            int currSum=arr[left]+arr[right];
            if(Math.abs(target-currSum)<minDiff){
                minDiff=Math.abs(target-currSum);
                res=Arrays.asList(arr[left],arr[right]);
            }
            if(currSum<target){
                left++;
            }
            else if(currSum>target){
                right--;
            }
            else{
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        List<Integer> res = sumClosest(arr, target);
        if(res.size() > 0)
            System.out.println(res.get(0) + " " + res.get(1));
    }

}
