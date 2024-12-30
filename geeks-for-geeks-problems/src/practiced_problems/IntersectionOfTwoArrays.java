package practiced_problems;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int start=0,end=a.length-1;
            if(start<=end){
                if(a[start]==a[end]){
                    result.add(a[start]);
                    start++;
                    end--;
                }
            }
        }
        for(int j=0;j<b.length;j++){
            int start=0,end=b.length-1;
            if(start<=end){
                if(b[start]==b[end]){
                    result.add(b[start]);
                    start++;
                    end--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        System.out.println(intersectionOfTwoArrays.intersection(new int[] { 1, 2, 1,3,1 }, new int[] { 3,1,3,4,1}));
    }
}
