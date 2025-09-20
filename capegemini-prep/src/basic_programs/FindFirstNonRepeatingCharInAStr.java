package basic_programs;
import java.util.*;
public class FindFirstNonRepeatingCharInAStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(map.get(c)==1){
                System.out.println("First non-repeating:" + c);
                break;
            }
        }
    }
}
