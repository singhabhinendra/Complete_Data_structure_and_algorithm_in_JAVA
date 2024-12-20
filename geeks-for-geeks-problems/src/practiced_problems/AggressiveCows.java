package practiced_problems;
import java.util.*;
public class AggressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int res = 0;
        int low =1;
        int high =stalls[stalls.length -1]- stalls[0];
        while(low <= high){
            int mid =low + (high-low)/2;
            if(check(stalls,k,mid)){
                res=mid;
                low= mid+1;
            }
            else{
                high= mid -1;
            }
        }
        return res;

    }
    static boolean check(int[] stalls, int k, int dist){
        int count=1;
        int prev=stalls[0];
        for(int i=1 ;i<stalls.length; i++){
            if(stalls[i] - prev>=dist){
                prev = stalls[i];
                count++;
            }
        }
        return (count >=k);
    }
     public static void main(String[] args){
        AggressiveCows aggressiveCows = new AggressiveCows();
        System.out.println(aggressiveCows.aggressiveCows(new int[]{1,2,3,4,5}, 3));

     }
}
