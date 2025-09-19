import java.util.*;
public class FindSubsequenceOfLengthKWithTheLargSum {
    public static int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];

        if (nums.length <= k) {
            return nums;
        }
        int[] sorted = nums.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = sorted.length - 1; i >= sorted.length - k; i--) {
            freq.put(sorted[i], freq.getOrDefault(sorted[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                list.add(num);
                freq.put(num, freq.get(num) - 1);
                if (list.size() == k) {
                    break;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(maxSubsequence(new int[]{63, -74, 61, -17, -55, -59, -10, 2, -60, -65}, 9)));
    }
}
