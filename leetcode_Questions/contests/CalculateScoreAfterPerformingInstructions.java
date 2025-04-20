package contests;
public class CalculateScoreAfterPerformingInstructions {

    public static void main(String[] args) {
        String[] instructions = {"jump", "add", "add", "jump", "add", "jump"};
        int[] values = {2, 1, 3, 1, -2, -3};
        System.out.println(calculateScore(instructions, values));

    }

    public static long calculateScore(String[] instructions, int[] values) {
        int n = instructions.length;
        boolean[] visit = new boolean[n];
        int i = 0;
        long score = 0;
        while (i < n) {
            if (i < 0 || i >= n) return score;
            if (visit[i]) return score;
            visit[i] = true;
            if (instructions[i].equals("jump")) {
                i += values[i];
            } else {
                score += values[i];
                i++;
            }
        }
        return score;
    }

}
