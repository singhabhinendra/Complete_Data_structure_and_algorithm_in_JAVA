// parameterised recursion
//In this mehod method,we use void return type by parameterised way.
import java.util.Scanner;
public class SummationOfNthNaturalNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printSummation(n,0);
    }
    public static void printSummation(int n, int i){
        if(n<1){
            System.out.println(i);
            return ;
        }
        printSummation(n-1,i+n);
    }
}
