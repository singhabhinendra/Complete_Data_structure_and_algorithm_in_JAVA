//Problem Statement: Print from N to 1 using Backtracking not by earlier methods like f(i+1,n)
//In the problem ,we used some concepts of Backtracking like first traverse all posibilities till base case and start reverse printing.
import java.util.Scanner;
public class PrintFrom1ToNBacktracking {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        printNumber(number,number);
    }
    public static void printNumber(int i, int number){
        if(i<1){
            return;
        }
        printNumber(i-1,number);
        System.out.println(i);
    }
}
