package practiced_problems;

/*Complexity Analysis:
    Time complexity : O(log n).
    The time complexity of binary search is O(log n)
    Space complexity : O(1).
    As no extra space is required, so the time complexity is constant.
*/
public class IndexOfAnExtraElement2 {
    static int findExtra(int[] arr1,int[] arr2){
        for(int i=0;i<arr2.length;i++){
            if(arr1[i]!=arr2[i]) {
                return i;
            }
        }
        return arr2.length;
    }
    public static void main(String[] args){
        int[] arr1={2,4,6,8,10,12,13};
        int[] arr2={2,4,6,8,10,12};
        int n=arr2.length;
        System.out.println(findExtra(arr1,arr2));
    }
}
