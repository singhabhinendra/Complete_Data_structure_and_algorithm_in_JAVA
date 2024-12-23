import java.util.HashMap;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> numFrequency=new HashMap<>();
        for(int num:nums){
            numFrequency.put(num,numFrequency.getOrDefault(num,0)+1);
        }
        for(int num: numFrequency.keySet()){
            if(numFrequency.get(num)==1){
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        SingleNumberII s = new SingleNumberII();
        System.out.println(s.singleNumber(new int[]{2,2,3,2}));
    }

}
