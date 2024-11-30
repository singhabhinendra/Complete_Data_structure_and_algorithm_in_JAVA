import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(findFactorial(n));
    }
    public static int findFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
}
