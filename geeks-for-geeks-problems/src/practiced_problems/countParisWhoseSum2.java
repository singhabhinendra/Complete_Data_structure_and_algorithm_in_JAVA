package practiced_problems;

import java.util.Arrays;

public class countParisWhoseSum2 {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int cnt = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                cnt += right - left;
                left++;
            }
            else {
                right--;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        countParisWhoseSum2 test = new countParisWhoseSum2();
        System.out.println(test.countPairs(new int[] { 1, 2, 3, 4, 5 }, 2));
    }
}
