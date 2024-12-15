package practiced_problems;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    int[] pushZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2,0,4,3,0,5,0};
        System.out.println(Arrays.toString(new MoveAllZeroesToEnd().pushZerosToEnd((arr))));

    }
}
