package twoDArray;
import java.util.Arrays;
import java.util.Scanner;
public class Implementation{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int rowLen=scanner.nextInt();
        int colLen=scanner.nextInt();
        int[][] arr=new int[rowLen][colLen];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col]=scanner.nextInt();
            }
        }
//        using for loop
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[0].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println( );
//        }
//        it's output is like original matrix of using single for loop having print array in each iteration
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        using enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        String[] arr1= new String[4];
        System.out.println(arr1[0]);
        for(String element:arr1){
            System.out.println(element);
        }
    }
}
