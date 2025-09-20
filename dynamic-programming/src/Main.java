//dynamic Programming implementation
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        fib(n,dp);
    }
    public static int fib(int n,int[] dp){
        if(n<=1){
            return dp[n];
        }
        return 0;
    }

}