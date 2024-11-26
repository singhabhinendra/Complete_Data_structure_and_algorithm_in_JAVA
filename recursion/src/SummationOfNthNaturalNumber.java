import java.util.Scanner;
public class SummationOfNthNaturalNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printSummation(n,0);
    }
    public static void printSummation(int n, int i){
        if(i<1){
            return;
        }
        printSummation(i-1,i+n);
    }


}
