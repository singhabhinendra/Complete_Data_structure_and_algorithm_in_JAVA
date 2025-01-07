package practiced_problems;

import java.util.List;
import java.util.*;
public class PairSumClosestToTarget2 {
    static List<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length;

        List<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Generating all possible pairs
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int currSum = arr[i] + arr[j];
                int currDiff = Math.abs(currSum - target);

                // if currDiff is less than minDiff, it indicates
                // that this pair is closer to the target
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    res = Arrays.asList(Math.min(arr[i], arr[j]),
                            Math.max(arr[i], arr[j]));
                }

                // if currDiff is equal to minDiff, find the one with

                else if (currDiff == minDiff &&
                        (res.get(1) - res.get(0)) < Math.abs(arr[i] - arr[j])) {
                    res = Arrays.asList(Math.min(arr[i], arr[j]),
                            Math.max(arr[i], arr[j]));
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumClosest(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
    }
}
