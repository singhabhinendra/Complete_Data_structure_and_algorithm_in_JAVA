package basic_programs;
import java.util.*;
public class RemoveDupCharFromAStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result=new StringBuilder();
        Set<Character> seen=new HashSet<>();
        for(char c:input.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
