/*Complexity Analysis:
    Time complexity: O(n).
    As one traversal through the array is needed, so the time complexity is linear.
    Space complexity: O(1).
    Since no extra space is required, the time complexity is constant.
*/
public class IndexOfAnExtraElement {
    public static void main(String[] args) {
        int[] arr1={3,5};
        int[] arr2={3};
        IndexOfAnExtraElement index= new IndexOfAnExtraElement();
        System.out.println(index.indexOfExtraElement(arr1,arr2));
    }
    public int indexOfExtraElement(int[] arr1,int[] arr2){
        int index=arr2.length;
        int left=0;
        int right=arr2.length-1;
        while(left <= right){
            int mid=(left+right)/2;
            if(arr2[mid]==arr1[mid]){
                left=mid+1;
            }
            else{
                index=mid;
                right=mid-1;
            }
        }
        return index;
    }
}
