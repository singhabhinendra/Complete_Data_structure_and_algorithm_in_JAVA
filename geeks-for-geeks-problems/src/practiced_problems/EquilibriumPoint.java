/*This is a Good Approach,in which the Time Complexity is O(n) and Space O(n).
* Steps 1-Take A Sum Array after iterating the original array ,
* 2- Check from index 1 to arr.length-2 in original array,
* 3- Take two variables like lSum and rSum and check these are equals to each other if Yes ,return it's return and else return -1; */
package practiced_problems;
import java.util.Arrays;
public class EquilibriumPoint {
public static void main(String[] args){
    EquilibriumPoint eP= new EquilibriumPoint();
    System.out.println(eP.findEquilibrium(new int[]{1,2,0,3}));
}
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            if(i>0) {
                sum[i] = sum[i - 1] + arr[i];
            }
            else{
                sum[i] = arr[i];
            }
        }
        for(int i=1;i<n-1;i++){
            int lSum=sum[i]-arr[i];
            int rSum=sum[arr.length-1]-sum[i];
            if(lSum==rSum){
                return i;
            }
        }
        return -1;
    }
}
