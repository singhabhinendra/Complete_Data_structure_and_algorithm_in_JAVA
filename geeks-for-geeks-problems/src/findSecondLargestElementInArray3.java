public class findSecondLargestElementInArray3 {
    static int findSecondLargest(int[] nums) {
        int n=nums.length;
        int largest=1,secondLargest=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest && nums[i]!=secondLargest){
                secondLargest=nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        findSecondLargestElementInArray3 a=new findSecondLargestElementInArray3();
        System.out.println(findSecondLargestElementInArray3.findSecondLargest(new int[]{1,2,3,4,5,6,7,8,9}));

    }
}
