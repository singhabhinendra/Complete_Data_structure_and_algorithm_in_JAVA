package practiced_problems;

import java.util.HashSet;
import java.util.Set;

public class kthMissingPositiveNoInSortedArr {
    static int kthMissing(int[] arr, int k) {

        // Insert all array elements into a set
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0, curr = 0;

        // Loop until we find the k-th missing number
        while (count < k) {
            curr++;

            // Increment missing count if current
            // element is missing
            if (!set.contains(curr)) {
                count++;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(kthMissing(arr, k));
    }

}
