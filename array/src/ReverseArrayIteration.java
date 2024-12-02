import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class ReverseArrayIteration {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int[] arr=new int[scanner.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }

    }
}
//let arr= {1,2,3,4};
//i=0->1,j=arr.length-1->4;