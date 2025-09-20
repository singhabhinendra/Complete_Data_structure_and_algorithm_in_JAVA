package basic_programs;
import java.util.*;
public class CountfreqOfEachCharInAStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        for(char c:input1.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }
}
