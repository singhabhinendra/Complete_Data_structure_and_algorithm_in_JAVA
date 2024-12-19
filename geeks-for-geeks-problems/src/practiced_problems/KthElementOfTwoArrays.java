package practiced_problems;

import java.util.Arrays;
import java.util.Scanner;

public class KthElementOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//       int[] a=new int[] {2,3,6,7,9};
//       int[] b=new int[] {1,4,8,10};
//       int k=5;
        int[] a =new int[]{100, 112, 256, 349, 770};
        int[] b =new int[] {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        KthElementOfTwoArrays obj = new KthElementOfTwoArrays();
        obj.kthElement(a, b, k);
    }
    public void  kthElement(int a[], int b[], int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int newLength=a.length+b.length;
        int[] combineArray=new int[newLength];
        System.arraycopy(a, 0, combineArray, 0, a.length);
        System.arraycopy(b, 0, combineArray, a.length, b.length);
        Arrays.sort(combineArray);
        System.out.println(Arrays.toString(combineArray));
        System.out.println(combineArray[k-1]);
    }
}
