package contests.Weeklycontest132;

public class MaximumAmountOfMoneyRobotCanEarn {
    public int maximumAmount(int[][] coins){
        int m=coins.length;
        int n=coins[0].length;
        int[][][] dp=new int[m][m][m];
        for(int k=0;k<=2;k++){
            dp[0][0][k]=(coins[0][0]<0 && k>0)?0:coins[0][0];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2; k++) {
                    if (i == 0 && j == 0) continue;
                    int maxProfit = Integer.MIN_VALUE;
                    if (i > 0) maxProfit = Math.max(maxProfit, dp[i-1][j][k]);
                    if (j > 0) maxProfit = Math.max(maxProfit, dp[i][j-1][k]);
                    dp[i][j][k] = maxProfit + coins[i][j];

                    if (coins[i][j] < 0 && k > 0) {
                        int neutralizedProfit = Integer.MIN_VALUE;
                        if (i > 0) neutralizedProfit = Math.max(neutralizedProfit, dp[i-1][j][k-1]);
                        if (j > 0) neutralizedProfit = Math.max(neutralizedProfit, dp[i][j-1][k-1]);
                        dp[i][j][k] = Math.max(dp[i][j][k], neutralizedProfit);
                    }
                }
            }
        }
        return Math.max(dp[m-1][n-1][0], Math.max(dp[m-1][n-1][1], dp[m-1][n-1][2]));
    }
    public static void main(String[] args){
        MaximumAmountOfMoneyRobotCanEarn obj = new MaximumAmountOfMoneyRobotCanEarn();
        System.out.println(obj.maximumAmount(new int[][]{{0,1,-1},{1,-2,3},{2,-3,4}}));
    }
}
