//Naive Approach by generating all possible Pairs -O(n^2) time and O(1) space .

package practiced_problems;
import java.util.HashSet;

public class CountParisWithGivenSum {
    int countPairs(int arr[], int target) {
       int n=arr.length;
       int cnt=0;
       for(int i=0;i<n;i++) {
           for(int j=i+1;j<n;j++) {
               if(arr[i]+arr[j]==target) {
                   cnt++;
               }
           }
       }
       return cnt;
    }
    public static void main(String[] args){
        CountParisWithGivenSum testObject = new CountParisWithGivenSum();
        System.out.println(testObject.countPairs(new int[] { 5, 6, 5, 7, 7, 8}, 13));
    }
}
