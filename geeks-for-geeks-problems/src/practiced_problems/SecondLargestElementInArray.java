package practiced_problems;//Time Complexity: O(n*logn), as sorting the array takes O(n*logn) time and
// traversing the array
// can take O(n) time in the worst case,
// so total time complexity = (n*logn + n) = O(n*logn).
//Auxiliary space: O(1), as no extra space is required.
import java.util.Arrays;
public class SecondLargestElementInArray {
    static int getSecondLargest(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{12,35,1,10,34,35,35}));
    }
}
