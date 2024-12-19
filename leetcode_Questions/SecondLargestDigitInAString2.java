import java.util.*;
public class SecondLargestDigitInAString2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        SecondLargestDigitInAString2 solution = new SecondLargestDigitInAString2();
        System.out.println(solution.secondLargestDigit(s));
    }
    public int secondLargestDigit(String s){
        int largest=-1;
        int secondLargest=-1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int digit =c-'0';
                if(digit > largest){
                    secondLargest=largest;
                    largest=digit;
                }
                else if(digit < largest && digit>secondLargest){
                    secondLargest=digit;
                }
            }
        }
        return secondLargest;
    }
}
