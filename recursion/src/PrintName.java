//Problem Statement-Print name five times
//Approach- This code is implemented using recursion
import java.util.Scanner;
public class PrintName {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        printName(name);
    }
    static int count=4;
    public static void printName(String name){
        if(count==0){
            return;
        }
        System.out.println(name);
        count--;
        printName(name);
    }
}
