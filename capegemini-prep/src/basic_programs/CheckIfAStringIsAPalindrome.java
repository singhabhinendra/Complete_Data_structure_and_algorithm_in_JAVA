package basic_programs;

import java.util.Scanner;

public class CheckIfAStringIsAPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reversed));
    }
}
