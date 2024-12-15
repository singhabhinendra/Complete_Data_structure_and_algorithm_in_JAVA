package GeeksForGeeks160DaysChallengeProblems.Arrays;
import java.util.Scanner;
import java.util.*;
public class Day02ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Swap elements from start to end
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        System.out.println("" + Arrays.toString(arr));
    }
}
