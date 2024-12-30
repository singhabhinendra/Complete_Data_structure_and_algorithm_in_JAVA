package practiced_problems;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    static List<Integer> intersect(int[] a,int[] b){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    if(!res.contains(a[i])){
                        res.add(a[i]);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] a={1,2,3,2,1};
        int[] b={3,2,2,3,3,2};
        List<Integer> res=intersect(a,b);
        for(int val: res){
            System.out.print(val + " ");
        }
    }
}
