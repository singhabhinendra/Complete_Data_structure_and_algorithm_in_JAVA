package basic_programs;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {
    public static void main(String[] args){
        String s1="listen";
        String s2="silent";
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Are Anagrams:" + Arrays.equals(arr1,arr2));
    }
}
