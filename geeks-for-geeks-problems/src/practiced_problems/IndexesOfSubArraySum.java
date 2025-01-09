package practiced_problems;

import java.util.ArrayList;

public class IndexesOfSubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int count = 0;
        int start = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            while (count > target && start <= i) {
                count -= arr[start];
                start++;
            }
            if (count == target) {
                list.add(start + 1);
                list.add(i + 1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        IndexesOfSubArraySum indexesOfSubArraySum = new IndexesOfSubArraySum();
        System.out.println(indexesOfSubArraySum.subarraySum(new int[] { 1, 2, 3, 4, 5 }, 5));
    }
}
