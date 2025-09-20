package basic_programs;
import java.util.*;
public class REverseAStringWithouUsingRev {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String output="";
        for(int i=input.length()-1;i>0;i--){
            output+=input.charAt(i);
        }
        System.out.println(output);
    }
}
