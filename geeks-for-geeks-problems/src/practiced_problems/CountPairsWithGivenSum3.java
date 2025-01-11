package practiced_problems;
import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum3 {
    static int countPairs(int[] arr, int target) {
        Map<Integer,Integer> freq=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(freq.containsKey(target-arr[i])) {
                count+=freq.get(target-arr[i]);
            }
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

        }
        return count;

    }
    public static void main(String[] args) {
        CountPairsWithGivenSum3 obj = new CountPairsWithGivenSum3();
        System.out.println(obj.countPairs(new int[] { 1, 5,7,-1,5 }, 6));
    }
}
