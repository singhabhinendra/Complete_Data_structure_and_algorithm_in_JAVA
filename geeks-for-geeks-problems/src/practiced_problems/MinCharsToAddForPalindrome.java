package practiced_problems;

import java.util.Scanner;

public class MinCharsToAddForPalindrome {
    public int minAddToMakeValid(String s){
        for( int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                int end = s.length() - i ;
                for (int p = 0, q = end; p < s.length() - 1; p++, q--) {
                    if (s.charAt(p) != s.charAt(q)) {
                        end--;
                    }else {
                        return s.length() - end;
                    }
                }
            }
            else {
                return 0;
            }

        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String str=scanner.nextLine();
        MinCharsToAddForPalindrome obj=new MinCharsToAddForPalindrome();
        System.out.println(obj.minAddToMakeValid(str));
    }
}
