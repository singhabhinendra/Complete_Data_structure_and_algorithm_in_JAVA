package practiced_problems;

import java.util.Arrays;

public class CountPossibleTriangles2 {
    static int countTriangles(int[] arr){
        int res=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int lo=j+1,hi=arr.length;
                int target=arr[i]+arr[j];
                while(lo<hi){
                    int mid=lo+(hi-lo)/2;
                    if(arr[mid]<target){
                        lo=mid+1;
                    }
                    else{
                        hi=mid;
                    }
                }
                int cnt=lo-j-1;
                res+=cnt;
            }
        }
        return res;
    }
}
