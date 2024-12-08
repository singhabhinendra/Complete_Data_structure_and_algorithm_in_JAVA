import java.util.Arrays;

public class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) result[i]=0;
            else if(nums[i]<0){
                if(i-(Math.abs(nums[i])%nums.length)>=0){
                    result[i]=nums[i-(Math.abs(nums[i])%nums.length)];
                }
                else{
                    result[i]=nums[nums.length+i-(Math.abs(nums[i])%nums.length)];
                }
            }
            else{
                result[i]=nums[((nums[i]%nums.length) + i)%nums.length];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TransformedArray t=new TransformedArray();
        System.out.println(Arrays.toString(t.constructTransformedArray(new int[]{3,-2,1,1})));
    }
}
