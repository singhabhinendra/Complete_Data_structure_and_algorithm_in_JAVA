/*Time Complexity of the Problem is [O(logm) +O(n)]
* Space Complexity of the Problem statement is O(1). */
package practiced_problems;
public class SearchInARowColumnSortedMatrix3 {
    public static void main(String[] args) {
        SearchInARowColumnSortedMatrix3 search = new SearchInARowColumnSortedMatrix3();
        System.out.println(search.searchMatrix(new int[][] {{3, 30, 38},{20, 52, 54},{35, 60, 69}},62));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]<=target&&target<=matrix[i][columns-1]){
                return binarySearch(matrix[i],target);
            }
        }
        return false;
    }
    public boolean binarySearch(int[] matrix,int target){
        int left = 0;
        int right = matrix.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[mid]==target){
                return true;
            }
            if(matrix[mid]>target){
                right = mid-1;
            }
            else if(matrix[mid]<target){
                left = mid+1;
            }
        }
        return false;
    }
}
