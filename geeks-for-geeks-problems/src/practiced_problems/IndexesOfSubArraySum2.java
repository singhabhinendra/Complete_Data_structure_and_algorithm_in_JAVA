package practiced_problems;

import java.util.ArrayList;

public class IndexesOfSubArraySum2 {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        // Pick a starting point for a subarray
        for (int s = 0; s < n; s++) {
            int curr = 0;

            // Consider all ending points
            // for the picked starting point
            for (int e = s; e < n; e++) {
                curr += arr[e];
                if (curr == target) {
                    res.add(s + 1);
                    res.add(e + 1);
                    return res;
                }
            }
        }
        // If no subarray is found
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] { 1, 2, 3, 4, 5 }, 5));
    }
}
