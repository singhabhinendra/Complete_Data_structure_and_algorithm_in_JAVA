/*Explaination--:
* * In This code , return type of Method is List<List<Integer>> (2d list) dictionary ,In Order to this ,we need to use
 * It stores all the indexes of triplets .It is main ArrayList which return
 * the answer of the code .We need to use List.of method to add all indexes to the final List./...*/
package practiced_problems;
import java.util.ArrayList;
import java.util.List;

public class SumFindTripletsWithZeroSum {
    public List<List<Integer>> findTriplets(int[] arr){
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            for(int k=i+1;k<arr.length-1;k++){
                for(int m=k+1;m<arr.length;m++){
                        if(arr[i]+arr[k]+arr[m]==0){
                            result.add(List.of(i,k,m));
                        }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        SumFindTripletsWithZeroSum solution = new SumFindTripletsWithZeroSum();
        System.out.println(solution.findTriplets(new int[] {0,-1,2,-3,1}));
    }
}
