import java.util.*;
public class SodukuSolver {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        solveSudoku(mat);
        for (int i = 0; i < mat.length; i++) {
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(int[][] mat){
        solveSudokuRec(mat,0,0);
    }
    public static boolean solveSudokuRec(int[] [] mat, int row, int col){
        if(row== 8 && col==9)
            return true;
        if(col==9){
            row++;
            col=0;
        }
        if(mat[row][col] !=0){
            return solveSudokuRec(mat,row,col+1);
        }
        for(int num =1; num<=9;num++){
            if(isSafe(mat,row,col,num)){
                mat[row][col]=num;
                if(solveSudokuRec(mat,row,col+1))
                    return true;
                mat[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] mat, int row, int col, int num) {
        for (int x = 0; x < 9; x++) {
            if (mat[row][x] == num) {
                return false;
            }
        }
        for (int x = 0; x < 9; x++) {
            if (mat[x][col] == num) {
                return false;
            }
        }
        int startRow = row - (row % 3), startCol = col - (col % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}

