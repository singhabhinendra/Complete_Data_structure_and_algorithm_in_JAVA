package practiced_problems;

import java.util.Arrays;
public class NonOverlappingIntervals {
    static int minRemoval(int intervals[][]) {
        int cnt = 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                cnt++;
                end = Math.min(intervals[i][1], end);
            }
            else
                end = intervals[i][1];
        }
        return cnt;
    }
    public static void main(String[] args){
        NonOverlappingIntervals solution = new NonOverlappingIntervals();
        System.out.println(solution.minRemoval(new int[][]{{1, 2}, {5, 10}, {18, 35}, {40, 45}}));
    }
}
