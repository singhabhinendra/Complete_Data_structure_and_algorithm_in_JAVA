public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num :nums){
            result ^=num;
        }
        return result;
    }
    public static void main(String[] args){
        SingleNumber2 obj = new SingleNumber2();
        System.out.println(obj.singleNumber(new int[]{1,2,2}));
    }
}
