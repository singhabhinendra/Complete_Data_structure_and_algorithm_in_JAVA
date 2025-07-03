package practiced_problems;

import java.util.ArrayList;

public class AverageOfPrefix {
    public static ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        ArrayList<Integer> prefixAvg = new ArrayList<>(arr.size());
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            prefixAvg.add(sum / (i + 1));
        }

        return prefixAvg;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(prefixAvg(arr));

    }
}
