import java.util.ArrayList;
import java.util.*;
public class InsetAndMergeInterval {
    static ArrayList<int[]> mergeOverlap(int[][] intervals){
        Arrays.sort(intervals,Comparator.comparingInt(a ->a[0]));
        ArrayList<int[]> res=new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last=res.get(res.size()-1);
            int[] curr=intervals[i];
            if(curr[0]<=last[1]){
                last[1]=Math.max(curr[1],last[1]);
            }
            else{
                res.add(curr);
            }
        }
        return res;
    }
    static ArrayList<int[]> insertInterval(int[][] intervals,int[] newInterval){
        ArrayList<int[]> intervalList=new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        return mergeOverlap(intervalList.toArray(new int[0][]));
    }
    public static void main(String[] args){
        int[] [] intervals={{1,3},{4,5},{6,7},{8,10}};
        int [] newInterval={5,6};
        ArrayList<int[]> res=insertInterval(intervals,newInterval);
        for(int[] interval:res){
            System.out.println(interval[0]+" "+interval[1]);
        }
    }
}
