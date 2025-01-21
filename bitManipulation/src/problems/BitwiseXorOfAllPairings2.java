/*
* */
package problems;
import java.util.HashMap;

public class BitwiseXorOfAllPairings2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,1,3},new int[]{10,2,5,0}));
    }
    public static int solution(int[] nums1,int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+n);
        }
        for(int num:nums2){
            map.put(num,map.getOrDefault(num,0)+m);
        }
        int result=0;
        for(int num:map.keySet()){
           if(map.get(num)%2!=0){
               result^=num;
           }
        }
        return result;
    }
}
