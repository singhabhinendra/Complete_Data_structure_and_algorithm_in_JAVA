/*[Naive Approach] Using Two Auxiliary Arrays -O(n*m) Time and O(n+m) Space.*/

package practiced_problems;
public class SetMatrixRowsAndColumnsToZeroes {
    public static void setMatrixZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] rows =new boolean[n];
        boolean[] columns=new boolean[m];
//        Traverse the matrix to fill row[] and cols[]
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(matrix[i][j]==0) {
                    rows[i]=true;
                    columns[j]=true;
                }
            }
        }
//        Set matrix elements to zero if they belong to a marked row or column
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
//                Mark cell (i,j) with zero if either
//                of row[i] or cols[j] is true
                if(rows[i]||columns[j]) {
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix={
            {0,1,2,0},
            {3,4,0,2},
            {1,3,1,5}
        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After set zeroes to matrix[i][i]=0");
        setMatrixZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
