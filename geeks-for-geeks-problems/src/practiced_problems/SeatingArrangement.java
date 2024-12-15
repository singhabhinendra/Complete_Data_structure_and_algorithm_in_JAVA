package practiced_problems;

import java.util.Scanner;
public class SeatingArrangement {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        SeatingArrangement seatingArrangement=new SeatingArrangement();
        System.out.println(findMax(k,n,m));
    }
    public static int findMax(int k, int n, int m) {
        long capacity = (long) k * m; // Total seating capacity

        if (capacity < n) {
            return -1; // Not enough seats for all students
        }

        int low = 0, high = Math.min(k, n), result = 0;

        while (low <= high) {
            int alone = low + (high - low) / 2; // Midpoint of search
            long remaining = n - alone; // Remaining students to be seated

            // Check if the remaining students can fit in the remaining benches
            if (remaining <= (long) (k - alone) * m) {
                result = alone; // Update result and search for more
                low = alone + 1;
            } else {
                high = alone - 1; // Reduce search space
            }
        }

        return result;
    }
}
