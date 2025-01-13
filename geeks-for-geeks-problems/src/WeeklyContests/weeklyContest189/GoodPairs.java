package WeeklyContests.weeklyContest189;

public class GoodPairs {
    int mod=(int)1e9+7;
    int ncr(int n){
        return (int) (((1L* n*(n-1))/2)%mod);
    }
    public int cntGood(int n,int k){
        int elems=n+1;
        int d=elems/k;
        int r=elems%k;
        int ans=elems;
        ans+=(int)((1L *r*ncr(d+1))% mod);
        ans+=mod;
        ans+=(int)((1L * (k-r)* ncr(d))%mod);
        ans%=mod;
        return ans;
    }
}
