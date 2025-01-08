package practiced_problems;
import java.util.Arrays;

public class CountPossibleTriangles3 {
    static int countTriangles(int[] arr){
        int res=0;
        Arrays.sort(arr);
        for(int i=2;i<arr.length;i++){
            int left=0,right=i-1;
            while(left<right){
                if(arr[left]+arr[right]>arr[i]){
                    res+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={4,6,3,7};
        System.out.println(countTriangles(arr));
    }
}
