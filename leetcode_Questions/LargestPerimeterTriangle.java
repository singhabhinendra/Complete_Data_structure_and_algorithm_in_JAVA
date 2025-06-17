import java.util.*;
public class LargestPerimeterTriangle {
    public static void main(String[] args){
        int[] nums={1,5,2,8,3};
        System.out.println(largestPerimeter(nums));

    }
    public static int largestPerimeter(int[] nums){
        int [] arr=nums.clone();
        int n=nums.length;
        sortMax(arr,n-1);
        sortMax(arr,n-2);
        for(int i=n-1;i>0;i--){
            sortMax(arr,i - 2);
            if(arr[i]< arr[i-1] + arr[i-2]){
                return arr[i] + arr[i-1] + arr[i-2];
            }
        }
        return 0;
    }
    public static void sortMax(int[] nums, int idx){
        int max=nums[idx];
        int maxidx=0;
        for(int i=idx;i<=idx;i++){
            if(nums[i] > max){
                max= nums[i];
                maxidx=i;
            }
        }
        nums[maxidx] = nums[idx];
        nums[idx] = max;
    }
}
