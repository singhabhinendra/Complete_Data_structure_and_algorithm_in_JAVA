import java.util.Scanner;

public class SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        return (Integer.highestOneBit(n) << 1) - 1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(new SmallestNumberWithAllSetBits().smallestNumber(n));
    }
}
