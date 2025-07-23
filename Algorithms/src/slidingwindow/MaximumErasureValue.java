package slidingwindow;
import java.util.*;
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;

        int[] cumSum = new int[n];
        cumSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            cumSum[i] = cumSum[i - 1] + nums[i];
        }

        int[] mp = new int[10001];
        Arrays.fill(mp, -1);

        int result = 0;
        int i = 0;
        int j = 0;

        while (j < n) {
            i = Math.max(i, mp[nums[j]] + 1); // jumping i so that i to j is valid

            // subarray sum of i to j
            int jthSum = cumSum[j];
            int ithSum = i - 1 < 0 ? 0 : cumSum[i - 1];

            result = Math.max(result, jthSum - ithSum);

            mp[nums[j]] = j;
            j++;
        }

        return result;
    }
    public static void main(String[] args){
        MaximumErasureValue  test=new MaximumErasureValue();
        System.out.println(test.maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
}
