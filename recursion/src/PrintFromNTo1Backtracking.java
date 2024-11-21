import java.util.Scanner;
public class PrintFromNTo1Backtracking {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        printNumber(1,number);
    }
    public static void printNumber(int i, int number){
        if(i>5){
            return;
        }
        printNumber(i+1,number);
        System.out.println(i);
    }
}
