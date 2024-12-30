/*Time Complexity: O(n2)
Auxiliary Space: O(n)
2. [Better Approach] Using Hashing - O(n2) time and O(n) space
*/
package practiced_problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class ThreeSum {
    static int[] threeSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0; i<n-2; i++) {
            Map<Integer,Integer> map=new HashMap<>();
            int currTarget=target-nums[i];
            for(int j=i+1; j<n; j++) {
                if(map.containsKey(currTarget-nums[j])){
                    return new int[] {nums[i],nums[j],currTarget-nums[j]};

                }
                map.put(nums[j],j);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ThreeSum sum=new ThreeSum();
        System.out.println(Arrays.toString(sum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}, 3)));
    }
}
