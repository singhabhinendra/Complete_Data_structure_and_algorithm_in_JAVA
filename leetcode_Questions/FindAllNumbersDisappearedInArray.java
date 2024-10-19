import java.util.ArrayList;
import java.util.List;
    public class FindAllNumbersDisappearedInArray {
        public static void main(String[] args) {
            System.out.println(findDisappearedNumbers(new int[]{1,2,1,2}));
        }

        public static List<Integer> findDisappearedNumbers(int[] nums) {
            // Mark numbers as visited by flipping the sign
            for (int i = 0; i < nums.length; i++) {
                int n = Math.abs(nums[i]);
                if (nums[n - 1] > 0) {
                    nums[n - 1] = -1 * nums[n - 1];
                }
            }

            // Find numbers that were not visited
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    res.add(i + 1);
                }
            }
            return res;
        }
    }

