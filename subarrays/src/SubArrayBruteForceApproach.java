import java.util.*;
public class SubArrayBruteForceApproach {
        public static int[] findSequenceArraySum(int[] arr,int s){
            int sum=0;
            int n=arr.length;
            for (int sp = 0; sp < n; sp++) {
                for (int end =sp; end < n; end++) {
                    for (int i = sp; i <=end ; i++) {
                        int i1 = arr[i];
                        System.out.print(i1);
                        sum+=i1;

                    }
//
                    System.out.println(sum);
                }
                System.out.println();
            }
            return arr;
        }
        public static int[] returnIndices(int[]arr){
            int n=arr.length;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0 || arr[i] == n - 1) {
                    arr[i] = i;
                    return arr;
                }
            }
            return null;
        }
        public static void main(String[] args) {
            int [] arr=new int[]{1,2,3,7,5};
            System.out.println(Arrays.toString(findSequenceArraySum(arr, 12)));
            System.out.println(Arrays.toString(returnIndices(arr)));
        }
}
