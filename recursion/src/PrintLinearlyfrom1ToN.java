//Problem Statement: Print Linearly natural numbers from given range like (from 1 to N) .
//This code is implemented using recursion.
import java.util.Scanner;
public class PrintLinearlyfrom1ToN {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printLinearly(n);

    }
    static int i=0;
    public static void printLinearly(int n) {
      if(i==n){
          return;
      }
      System.out.println(i+1);
      i++;
      printLinearly(n);
    }
}
