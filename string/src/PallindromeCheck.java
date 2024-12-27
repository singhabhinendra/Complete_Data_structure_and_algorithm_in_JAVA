import java.util.Arrays;
import java.util.Scanner;
public class PallindromeCheck {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        char []s1=s.toCharArray();
        reverse(s1);
        String reversedString=new String(s1);
        if(s.equals(reversedString)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        scanner.close();
    }
        static void reverse(char[] arr){
            int start=0,end=arr.length-1;
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }

        public static void swap(char[] arr,int index1,int index2){
            char temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
}
