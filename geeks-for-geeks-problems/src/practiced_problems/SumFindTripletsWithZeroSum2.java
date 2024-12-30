/*Explaination--:
* In This code , return type of Method is ArrayList<ArrayList<Integer>> (2d Arraylist) ,In Order to this ,we need to use
* to solve this code using 2 ArrayList respectively.It stores all the indexes of triplets .It is main ArrayList which return
* the answer of the code .We need another arraylist to add all indexes in that One Directional ArrayList. after adding all
* indexes .we add this 1D ArrayList into result 2D ArrayList/... */
package practiced_problems;
import java.util.ArrayList;
import java.util.List;
public class SumFindTripletsWithZeroSum2 {
    public ArrayList<ArrayList<Integer>> findTriplets1(int[] arr){
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            for(int k=i+1;k<arr.length-1;k++){
                for(int m=k+1;m<arr.length;m++){
                    if(arr[i]+arr[k]+arr[m]==0){
                        ArrayList<Integer> triplet =new ArrayList<>();
                        triplet.add(i);
                        triplet.add(k);
                        triplet.add(m);
                        res.add(triplet);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        SumFindTripletsWithZeroSum2 solution = new SumFindTripletsWithZeroSum2();
        System.out.println(solution.findTriplets1(new int[] {0,-1,2,-3,1}));
    }
}
