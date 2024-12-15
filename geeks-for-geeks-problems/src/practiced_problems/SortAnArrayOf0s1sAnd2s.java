package practiced_problems;

import java.util.Arrays;
public class SortAnArrayOf0s1sAnd2s {
    public int[] sort012(int[] arr) {
        int c0=0,c1=0,c2=0;
        int j=arr.length;
        for(int i=0;i<j;i++){
            if(arr[i]==0){
                c0+=1;
            }
            else if(arr[i]==1){
                c1+=1;
            }
            else{
                c2+=1;

            }
        }
        int indx=0;
        for(int i = 0 ; i < c0 ; i++){
            arr[indx++] = 0;
        }
        for(int i = 0 ; i < c1 ; i++){
            arr[indx++] = 1;
        }
        for(int i =0 ; i < c2;i++){
            arr[indx++] = 2;
        }
        return arr;
    }
    public static void main(String [] args){
        SortAnArrayOf0s1sAnd2s sort = new SortAnArrayOf0s1sAnd2s();
        System.out.println(Arrays.toString(sort.sort012(new int[]{0,1,0,1,2,2,0,2,1,0,2,1,0})));
    }
}
