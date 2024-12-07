//This the bruteforce approach of problem Statement count Inversions of An Array in GeekforGeeks .
//
import java.util.Scanner;

public class CountInversionsOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        CountInversionsOfAnArray countInversionsOfAnArray = new CountInversionsOfAnArray();
        System.out.println(countInversionsOfAnArray.countInversions(new int[]{5, 9, 4, 3}));
    }

    public int countInversions(int[] nums) {
        int inversionCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j] && i < j) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }
}
