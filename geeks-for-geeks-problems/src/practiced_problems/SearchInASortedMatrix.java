package practiced_problems;

public class SearchInASortedMatrix {
    public boolean searchMatrix(int[][] mat, int x) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0, high = (rows * cols) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInASortedMatrix solution = new SearchInASortedMatrix();
        System.out.println(solution.searchMatrix(new int[][]{{1, 3}, {2, 5}, {6, 7}, {8, 9}}, 8));
    }
}
