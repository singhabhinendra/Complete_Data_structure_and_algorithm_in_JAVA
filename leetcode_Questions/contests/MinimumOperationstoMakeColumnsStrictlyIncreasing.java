package contests;
import java.util.*;
import java.io.*;
import java.lang.Math.*;
public class MinimumOperationstoMakeColumnsStrictlyIncreasing {
    public int minimumOperations(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int operations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m-1;j++) {
                if (grid[i][j] >= grid[i + 1][j]) {
                    int toAdd = Math.abs(grid[i - 1][j] - grid[i][j]) + 1;
                    grid[i + 1][j] += toAdd;
                    operations += toAdd;
                }
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        int[][]grid ={{3,2},{1,3},{3,4},{0,1}};
        MinimumOperationstoMakeColumnsStrictlyIncreasing obj=new MinimumOperationstoMakeColumnsStrictlyIncreasing();
        System.out.println(obj.minimumOperations(grid));

        System.out.println("Grid after operations:");
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }

    }
}
