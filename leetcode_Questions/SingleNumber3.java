import java.util.Arrays;
public class SingleNumber3 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args){
        SingleNumber3 s = new SingleNumber3();
        System.out.println(s.singleNumber(new int[]{1,2,2,3,3,4}));
    }
}
