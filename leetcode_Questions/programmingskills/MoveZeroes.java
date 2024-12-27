package programmingskills;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums){
        int insertPos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPos++]=nums[i];
            }
        }
        for(int i =insertPos;i<nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{0,1,0,3,12,0,0};
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
