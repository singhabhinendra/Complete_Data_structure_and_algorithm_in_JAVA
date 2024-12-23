/*Time Complexity of this problem is O(log(m*n)).
* Space Complexity of this problem is O(1).*/
package practiced_problems;
public class SearchInARowColumnSortedMatrix2 {
    public static void main(String[] args){
        SearchInARowColumnSortedMatrix2 search = new SearchInARowColumnSortedMatrix2();
        System.out.println(search.searchMatrix(new int[][] {{3, 30, 38},{20, 52, 54},{35, 60, 69}},62));
    }
    public boolean searchMatrix(int[][] matrix,int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0,high=(n*m-1);
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m,col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else if(matrix[row][col]>target){
                high=mid-1;
            }
        }
        return false;
    }
}
