/*Time complexity of this problem is : O(n2) becuse used two nested for loops.
* Space Complexity is O(n) */
import java.util.Arrays;
public class FindPrCommArrOfTwoArr2 {
    public int[] findThePrefixCommonArray(int[] A, int[] B){
        int[] result=new int[A.length];
        boolean[] isPresentA=new boolean[A.length+1];
        boolean[] isPresentB=new boolean[A.length+1];
        for(int i=0;i<A.length;i++){
            isPresentA[A[i]]=true;
            isPresentB[B[i]]=true;
            int count=0;
            for(int j=1;j<=A.length;j++){
                if(isPresentA[j]==true && isPresentB[j]==true){
                    count++;
                }

            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args){
        FindPrCommArrOfTwoArr2 obj=new FindPrCommArrOfTwoArr2();
        System.out.println(Arrays.toString(obj.findThePrefixCommonArray(new int[]{1, 2, 3}, new int[]{2, 3, 1})));
    }
}
