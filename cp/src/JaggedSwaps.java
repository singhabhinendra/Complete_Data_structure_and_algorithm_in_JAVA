import java.util.*;
public class JaggedSwaps{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                long n = sc.nextLong();
                long[] arr = new long[(int) n];  // array size must be int in Java

                for (int j = 0; j < n; j++) {   // start from 0
                    arr[j] = sc.nextLong();
                }

                if (arr[0] == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

            sc.close();
        }
    }
