// Running time of this code on Leetcode is 3 ms and TimeComplexity is O(N)+O(M):
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanTwoInteger {
    public int romanToInt(String s) {
        List<Character> str=new ArrayList<>();
        int result=0;
        for(char t : s.toCharArray()){
            str.add(t);
        }
        for(int i=0;i<str.size();i++){
            char current=str.get(i);
            if(current == 'I'){
                if((i + 1) < str.size() && (str.get(i+1) == 'X' || str.get(i+1) == 'V')){
                    result+= str.get(i+1) == 'X' ? 9 : 4;
                    i++;
                }
                else{
                    result++;
                }
            }
            else if(current == 'V'){
                result+=5;
            }
            else if(current == 'X'){
                if(i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')){
                    result+= str.get(i+1) == 'C'? 90 : 40;
                    i++;
                }
                else{
                    result+=10;
                }
            }
            else if (current == 'L'){
                result+= 50;
            }
            else if (current == 'C'){
                if(i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    result+= str.get(i+1) == 'D'? 400:900;
                    i++;
                }
                else{
                    result+=100;
                }
            }
            else if(current == 'D'){
                result +=500;
            }
            else if(current == 'M'){
                result +=1000;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        RomanTwoInteger obj=new RomanTwoInteger();
        System.out.println(obj.romanToInt(s));
    }
}
