package Subarray.resources;

public class LongestSubarrayWithEqualNoOf0and1s {
    public static int longestSubarray(int[] A) {
        int res=0;
//        pick a starting point as sp;
        for(int sp=0;sp<A.length;sp++){
            int sum=0;
//            Consider all subarrays arr[sp...ep]
            for(int ep=sp;ep<A.length;ep++){
                sum+=(A[ep]==0)? -1:1;
//                check if it's a 0-sum subarray
                if(sum==0){
//                    Update max size
                    res=Math.max(res,ep-sp+1);
                }
            }
        }
        return res;
    }
    public static void main (String[] args){

        int[] arr={1,0,0,1,0,1,1};
        System.out.println(longestSubarray(arr));
    }
}
