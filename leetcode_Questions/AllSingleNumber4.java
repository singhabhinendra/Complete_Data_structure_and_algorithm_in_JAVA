import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSingleNumber4 {
    public void singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] singleNums=new int[nums.length];
        for(int i=1;i<nums.length;i+=2){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static void main(String[] args) {
        AllSingleNumber4 solution = new AllSingleNumber4();
        solution.singleNumber(new int[]{1,2,2,3,3,4});
    }
}
