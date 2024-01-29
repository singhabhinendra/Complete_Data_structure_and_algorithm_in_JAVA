
import java.util.Scanner;

public class Code_34_firstlastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println("The first and last positions are: " + ans[0] + " " + ans[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums, target);
        if (lb == n || nums[lb] != target) return new int[]{-1, -1};
        int ub = upperBound(nums, target);
        return new int[]{lb, ub - 1};

    }

    public static int upperBound(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (nums[mid] > target) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int lowerBound(int[] nums, int target) {
        int n=nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (nums[mid] >= target) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
