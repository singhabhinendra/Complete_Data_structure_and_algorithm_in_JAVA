package practiced_problems;

//[Better Approach] Two Pass Search – O(n) Time and O(1) Space
//
//The approach is to traverse the array twice. In the first traversal,
//find the maximum element. In the second traversal, find
//the maximum element ignoring the one we found in the first traversal.
//Time Complexity: O(2*n) = O(n), as we are traversing the array only once.
//Auxiliary space: O(1), as no extra space is required.
public class findSecondLargestInArray {
    static int getSecondLargest(int[] arr){
        int n=arr.length;
        int largest =-1,secondLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int j=0;j<n;j++) {
            if (arr[j] > secondLargest && arr[j] != largest) {
                secondLargest = arr[j];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(getSecondLargest(arr));
    }
}
//{1,2,5,2,7,9}
