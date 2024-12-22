package practiced_problems;

import java.util.ArrayList;
import java.util.List;

/*You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.
Examples:
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation:
Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
Explanation: Applying same technique as shown above.
Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
Output: [32, 44, 27, 23, 62, 50, 28, 54]
Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].*/
public class SpirallyTraversingAMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        SpirallyTraversingAMatrix solution = new SpirallyTraversingAMatrix();
        ArrayList<Integer> res = solution.spirallyTraverse(mat);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> res=new ArrayList<>();
        boolean[][] vis= new boolean[m][n];
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        int r=0,c=0;
        int idx=0;
        for(int i=0;i<m*n;++i){
            res.add(mat[r][c]);
            vis[r][c]=true;
            int newR= r+dr[idx];
            int newC = c+dc[idx];
            if(0<=newR && newR<m && 0<=newC && newC<n && !vis[newR][newC]){
                r=newR;
                c=newC;
            }
            else{
                idx=(idx+1)%4;
                r+=dr[idx];
                c+=dc[idx];
            }
        }
        return res;
    }
}

