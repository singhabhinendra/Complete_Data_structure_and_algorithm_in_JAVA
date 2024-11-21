//Problem Statement: Print Linearly natural numbers from N to 1.
//This code is implemented in recursion.
import java.util.Scanner;
public class PrintLinearlyNto1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printLinearly(n, n);
    }
    public static void printLinearly( int i,int n){
        if(i==0){
            return;
        }
        System.out.println(i);
        printLinearly(i-1,n);
    }

}
