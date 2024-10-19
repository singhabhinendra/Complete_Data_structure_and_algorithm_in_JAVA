import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[start]=nums[i];
                start++;
            }
            else{
                arr[end]=nums[i];
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(sortArrayByParity.sortArrayByParity(nums)));
    }
}
