package LongestIncreasingSubsequence;

import java.util.Arrays;

public class FindMaxLenValSubseq2 {
    public static void main(String[] args) {
        FindMaxLenValSubseq2 f = new FindMaxLenValSubseq2();
        System.out.println(f.maximumLength(new int[]{1,2,3,4,5},2));

    }
    public int maximumLength(int[] nums,int k){
        int n=nums.length;
        int[][] dp=new int[k][n];
        for(int  mod=0;mod<k;mod++){
            Arrays.fill(dp[mod],1);
        }
        int maxSub=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int mod=(nums[j]+nums[i])%k;
                dp[mod][i]=Math.max(dp[mod][i],1+ dp[mod][j]);
                maxSub=Math.max(maxSub,dp[mod][i]);
            }
        }
        return maxSub;
    }

}
