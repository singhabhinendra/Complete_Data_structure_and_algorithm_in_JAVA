package programmingskills;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPrCommArrOfTwoArr3 {
    public int[] findCommAr(int[] A,int[] B){
        int[] result=new int[A.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(map.get(A[i])==2){
                count++;
            }
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            if(map.get(B[i])==2){
                count++;
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args){
        FindPrCommArrOfTwoArr3 f = new FindPrCommArrOfTwoArr3();
        System.out.println(Arrays.toString(f.findCommAr(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 1})));
    }
}
