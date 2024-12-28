package programmingskills;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int product=1;
        for(int digit:nums){
            if(digit==0){
                return 0;
            }
            if(digit<0){
                product*=-1;
            }
        }
        return product;
    }
    public static void main(String[] args) {
        SignOfTheProductOfAnArray s = new SignOfTheProductOfAnArray();
        System.out.println(s.arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
    }
}
