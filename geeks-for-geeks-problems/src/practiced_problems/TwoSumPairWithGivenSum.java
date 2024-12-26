package practiced_problems;

public class TwoSumPairWithGivenSum {
    boolean twoSum(int arr[], int target) {
        int first=0;
        int second=1;
        int end=arr.length;
        while(first<end && second<end){
            if(arr[first]+arr[second]==target){
                return true;
            }
            else if(second==arr.length-1){
                first++;
                second=first+1;
            }
            else{
                second++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        TwoSumPairWithGivenSum twoSumPair = new TwoSumPairWithGivenSum();
        System.out.println(twoSumPair.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }
}
