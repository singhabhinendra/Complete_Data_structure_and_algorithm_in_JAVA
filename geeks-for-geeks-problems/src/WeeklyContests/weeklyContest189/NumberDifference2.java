package WeeklyContests.weeklyContest189;

public class NumberDifference2 {
    public static int numDifference(int n) {
        int bitCount = 0;
        int diff = 0;

        while (n != 0) {  // Check until n becomes 0
            if ((n & 1) != 0) {  // Check if the least significant bit is 1
                diff += (1 << bitCount);  // Add 2^bitCount to diff
            } else {
                diff -= (1 << bitCount);  // Subtract 2^bitCount from diff
            }
            bitCount++;  // Increment bitCount to move to the next bit
            n >>= 1;  // Right shift n by 1 to process the next bit
        }

        return diff;


    }
    public static void main(String[] args){
        System.out.println(numDifference(5));
    }
}
