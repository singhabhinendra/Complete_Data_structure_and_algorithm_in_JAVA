package practiced_problems;
import java.util.*;
public class CountDistinctElementInWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        // Store the frequency of elements of the first window
        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        // Store the count of distinct elements of the first window
        res.add(freq.size());

        for (int i = k; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            freq.put(arr[i - k], freq.get(arr[i - k]) - 1);

            // If the frequency of arr[i - k] becomes 0,
            // remove it from the hash map
            if (freq.get(arr[i - k]) == 0) {
                freq.remove(arr[i - k]);
            }

            res.add(freq.size());
        }
        return res;
    }
    public static void main(String[] args) {
        CountDistinctElementInWindow test = new CountDistinctElementInWindow();
        System.out.println(test.countDistinct(new int[] {1,1,1,1,1},3));
    }
}
