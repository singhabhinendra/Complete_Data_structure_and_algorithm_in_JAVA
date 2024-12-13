// Time complexity for this Solution - O(n^2) + O(n) = O(n^2),i.e O(n^2)
// Space Complexity of this Solution - O(1)
import java.util.Arrays;
public class findSecondLargestElementInArray2 {
    public static int  findSecondLargest(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (arr[j] == arr[j + 1]) {
                    break;
                }
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println((findSecondLargest(new int[]{1,3,42,2,5})));;
    }
}
