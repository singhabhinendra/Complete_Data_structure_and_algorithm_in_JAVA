import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s){
        int total=0;
        for(int i=0;i<s.length();i++){
            int value= getValue(s.charAt(i));
            if(i+1<s.length() && value<getValue(s.charAt(i+1))){
                total-=value;
            }else{
                total+=value;
            }
        }
        return total;
    }
    private static int getValue(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(romanToInt(s));
    }
}
