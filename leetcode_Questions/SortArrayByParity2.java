import java.util.Arrays;

public class SortArrayByParity2 {
        public int[] sortArrayByParity(int[] nums) {
            int evenIndex = 0;  // For even indices
            int oddIndex = 1;   // For odd indices
            int length = nums.length;
            while ( evenIndex < length && oddIndex < length) {
                if (nums[evenIndex] % 2 == 0) {
                    evenIndex += 2;
                } else if (nums[oddIndex] % 2 == 1) {
                    oddIndex += 2;
                } else {
                    int temp = nums[evenIndex];
                    nums[evenIndex] = nums[oddIndex];
                    nums[oddIndex] = temp;

                    evenIndex += 2;
                    oddIndex += 2;
                }
            }

            return nums;
        }

    public static void main(String[] args) {
        SortArrayByParity2 sol = new SortArrayByParity2();
        int[] arr=new int[]{3,1,4,2};
        System.out.println(Arrays.toString(sol.sortArrayByParity(arr)));
    }
}
