import java.util.Scanner;

public class SummationOfNaturalNUmberFunctional2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(printSummation(n));
    }
    public static int  printSummation(int n){
        if (n==0) {
            return 0;
        }
        return n+printSummation((n-1));
    }
}
