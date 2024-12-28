package programmingskills;

public class SignOfTheProductOfAnArray2 {
    public int arraySign(int[] nums) {
        int negativeCount =0;
        for(int num:nums){
            if(num<0) negativeCount++;
            if(num==0){
                return 0;
            }
        }
        return(negativeCount%2==0)?1:-1;
    }
    public static void main(String[] args) {
        SignOfTheProductOfAnArray2 s = new SignOfTheProductOfAnArray2();
        System.out.println(s.arraySign(new int[]{1,2,3,4}));
    }
}
