package practiced_problems;

import java.util.Scanner;
public class CheckIfOneStringIsARotationOfAnother {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        if(isRotation(s1,s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean isRotation(String s1, String s2){
        return s1.length() == s2.length() && ( s1 + s1).contains(s2);
    }
}
