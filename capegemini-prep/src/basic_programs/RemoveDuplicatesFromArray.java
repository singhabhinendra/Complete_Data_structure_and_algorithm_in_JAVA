package basic_programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println("Array without duplicates:"+ set);
    }
}
