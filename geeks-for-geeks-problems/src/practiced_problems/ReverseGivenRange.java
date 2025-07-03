package practiced_problems;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseGivenRange {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        l = l - 1;
        r = r - 1;

        if (l < 0 || r >= arr.size() || l > r) {
            return arr; // invalid input
        }

        while (l < r) {
            Collections.swap(arr, l, r);
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int l = 2;
        int r = 4;
        System.out.println(reverseSubArray(arr, l, r));
    }
}
