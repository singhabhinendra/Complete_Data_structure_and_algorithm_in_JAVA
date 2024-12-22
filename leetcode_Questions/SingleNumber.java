import java.util.Arrays;
import java.util.HashMap;
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numFrequency = new HashMap<>();
        for (int num : nums) {
            numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
        }
        for (int num : numFrequency.keySet()) {
            if (numFrequency.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{1,2,2,1}));
    }
}
