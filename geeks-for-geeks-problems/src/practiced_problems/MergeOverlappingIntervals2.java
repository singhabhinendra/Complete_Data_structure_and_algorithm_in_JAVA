package practiced_problems;

import java.util.Arrays;
public class MergeOverlappingIntervals2 {
    static int mergeOverlap(int[][] arr){
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        int resIdx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[resIdx][1]>=arr[i][0])
                arr[resIdx][1]=Math.max(arr[resIdx][1],arr[i][1]);
            else{
                resIdx++;
                arr[resIdx]=arr[i];
            }
        }
        return (resIdx + 1);
    }
    public static void main(String[] args){
        int[][] arr={{7,8},{1,5},{2,4},{4,6}};
        int newSize=mergeOverlap(arr);
        for(int i=0;i<newSize;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
