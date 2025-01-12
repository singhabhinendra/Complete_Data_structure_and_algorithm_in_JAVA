package contests.Weeklycontest132;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
public class ZigZagTraversalWithSkip {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result=new ArrayList<>();
//      Return empty list if grid is null or empty
        if(grid==null||grid.length==0||grid[0].length==0){
            return result;
        }
        int rows=grid.length;
        int cols=grid[0].length;
        boolean leftToRight=true;
//        Traverse row by row
        for(int i=0;i<rows;i++){
            if(leftToRight){
//                Traverse left to right
                for(int j=0;j<cols;j++){
                    if((i+j)%2==0){
                        result.add(grid[i][j]);
                    }
                }
            }
            else{
//                traversal right to left
                for(int j=cols-1;j>=0;j--){
                    if((i+j)%2==0){//skip based on diagonal-like condition
                        result.add(grid[i][j]);
                    }
                }
            }
//            Toggle Direction
            leftToRight=!leftToRight;
        }
        return result;
    }
//    Test the function
    public static void main(String[] args){
        ZigZagTraversalWithSkip obj=new ZigZagTraversalWithSkip();
        int[][] grid=new int[][]{{1,2,3},
                                    {4,5,6},
                                    {7,8,9}};
        List<Integer> result=obj.zigzagTraversal(grid);
        System.out.println("Zigzag Traversal with Skip:");
        System.out.println(result);
    }
}
