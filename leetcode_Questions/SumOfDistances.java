import java.util.*;

public class SumOfDistances {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> indices : map.values()) {
            int m = indices.size();
            long[] prefix = new long[m];
            prefix[0] = indices.get(0);
            for (int i = 1; i < m; i++) {
                prefix[i] = prefix[i - 1] + indices.get(i);
            }

            for (int i = 0; i < m; i++) {
                int idx = indices.get(i);
                long left = i > 0 ? (long)i * indices.get(i) - prefix[i - 1] : 0;
                long right = prefix[m - 1] - prefix[i] - (long)(m - i - 1) * indices.get(i);
                ans[idx] = left + right;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(new SumOfDistances().distance(nums)));
    }
}
