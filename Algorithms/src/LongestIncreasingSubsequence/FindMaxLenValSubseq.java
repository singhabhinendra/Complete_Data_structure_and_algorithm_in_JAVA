package LongestIncreasingSubsequence;

public class FindMaxLenValSubseq {
    public int maximumLength(int[] nums){
        int n=nums.length;
        int[][] dp=new int[2][n];

        for(int i=0;i<n;i++){
            dp[0][i]=1;
            dp[1][i]=1;
        }
        int maxSub=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int mod=(nums[j]+nums[i])%2;
                dp[mod][i]=Math.max(dp[mod][i],i+dp[mod][j]);
                maxSub=Math.max(maxSub,dp[mod][i]);
            }
        }
        return maxSub;
    }
    public static void main(String[] args) {
        FindMaxLenValSubseq f=new FindMaxLenValSubseq();
        System.out.println(f.maximumLength(new int[]{1,2,3,4}));
    }
}
