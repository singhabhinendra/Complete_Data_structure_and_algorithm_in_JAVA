package WeeklyContests.weeklyContest189;

public class countNDigitNumber2 {
     public long power(long a, long b, int mod){
         long ans=1;
         while(b>0){
             if((b & 1) !=0){
                 ans=(ans*a) % mod;
             }
             a=(a * a)% mod;
             b>>=1;
         }
         return ans;
     }
     public int countNumbers(long n){
         int mod=(int) (1e9 +7);
         long ans=power(4,n,mod)+power(3,n,mod)+1;
         ans%=mod;
         return (int) ans;
     }
     public static void main(String[] args){
         countNDigitNumber2 obj = new countNDigitNumber2();
         System.out.println(obj.countNumbers(1));
     }
}
