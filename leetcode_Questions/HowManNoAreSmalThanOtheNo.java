import java.util.Arrays;

public class HowManNoAreSmalThanOtheNo {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] prefix = new int[101];
        for(int i=0; i<nums.length; i++) {
            int pos = nums[i];
            prefix[pos]++;
        }
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i]+prefix[i-1];
        }
        for(int i=0; i<nums.length; i++) {
            int pos = nums[i];

            nums[i] = pos==0 ? 0: prefix[pos-1];
        }
        return nums;

    }
    public static void main(String[] args){
        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
