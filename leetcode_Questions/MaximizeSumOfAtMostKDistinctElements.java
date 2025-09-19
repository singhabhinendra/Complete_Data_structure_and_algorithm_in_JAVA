import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class MaximizeSumOfAtMostKDistinctElements {
    public static int[] maxDistinct(int[] nums, int k) {
        HashSet<Integer> uniqNum = new HashSet<>();
        for (int num : nums) {
            uniqNum.add(num);
        }

        TreeSet<Integer> sorted = new TreeSet<>(uniqNum);

        int n = Math.min(k, sorted.size());
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = sorted.pollLast();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxDistinct(new int[]{1,1,1,2,2,2}, 3)));
    }
}
