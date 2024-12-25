package practiced_problems;
public class SearchInARowColumnSortedMatrix {
    public static boolean matSearch(int mat[][], int x) {
        int rows = mat.length;
        int columns = mat[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        SearchInARowColumnSortedMatrix solution = new SearchInARowColumnSortedMatrix();
        System.out.println(solution.matSearch(new int[][]{{1,2},{3,4},{5,6}},2));
    }
}
