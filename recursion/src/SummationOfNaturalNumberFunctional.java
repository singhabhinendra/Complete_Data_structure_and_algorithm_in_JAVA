import java.util.Scanner;
public class SummationOfNaturalNumberFunctional {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(printSummation(n));
    }
     static int sum=0;
    public static int  printSummation(int n){
        if (n<1){
            return sum;
        }
        sum=sum+n;
        return printSummation((n-1));
    }
}
