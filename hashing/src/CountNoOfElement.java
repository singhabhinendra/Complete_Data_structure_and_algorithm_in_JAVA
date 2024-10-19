import java.util.Scanner;
public class CountNoOfElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
//  Precompute
        int[] hash=new int [100];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]+=1;

        }
        int q=scanner.nextInt();
        while(q>0){
            int number=scanner.nextInt();
            System.out.println("hash[number] = " + hash[number]);
            q--;
        }
    }
}
