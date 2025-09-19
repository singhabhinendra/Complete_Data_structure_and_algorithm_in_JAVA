import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2){
            System.out.println("false");
            return;
        }
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
        boolean isPrime=prime(n);
        System.out.println(isPrime);
    }
    public static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
