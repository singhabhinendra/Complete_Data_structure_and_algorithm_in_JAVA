/*This is the bruteforce solution for this Problem .Time Complexity
* of this solution is: O(n3) and Space complexity is : O(1).*/
import java.util.Arrays;
public class FindPrCommArrOfTwoArr {
    public int[] findCommArr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int count=0;
            for(int j = 0; j <=i; j++) {
                for(int k=0;k<=i;k++) {
                    if(arr1[i]==arr2[k]) {
                        count++;
                    }
                }
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args){
        FindPrCommArrOfTwoArr obj = new FindPrCommArrOfTwoArr();
        System.out.println(Arrays.toString(obj.findCommArr(new int[]{1, 2, 3, 4}, new int[]{2, 4, 3, 1})));
    }
}
