//Better Approach using two Pointers Technique -O(nlogn) Time and O(1) space
/**/
//
package practiced_problems;
public class CountPairsWithGivenSum2 {
    public int countPairs(int[] nums, int target) {
        int res=0;
        int n=nums.length;
        int left=0,right=n-1;
        while(left<right) {
            if(nums[left]+nums[right]<target) {
                left++;
            }
            else if(nums[left]+nums[right]>target) {
                right--;
            }
            else {
                int cnt1=0,cnt2=0;
                int ele1=nums[left],ele2=nums[right];
                while(left<=right && nums[left]==ele1) {
                    left++;
                    cnt1++;
                }
                while(left<=right && nums[right]==ele2) {
                    right--;
                    cnt2++;
                }
                if(ele1==ele2){
                    res+=(cnt1*(cnt1-1))/2;
                }
                else
                    res+=(cnt2*cnt1);

            }
        }
        return res;
    }
    public static void main(String[] args) {
        CountPairsWithGivenSum2 countPairsWithGivenSum2 = new CountPairsWithGivenSum2();
       System.out.println(countPairsWithGivenSum2.countPairs(new int[] { 2, 7, 11, 15 }, 9));
    }
}
