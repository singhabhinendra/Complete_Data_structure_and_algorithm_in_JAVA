package heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinDiffInSumAfRemEle {
    public long minimumDifference(int[] nums){
        int N =nums.length;
        int n=N/3;
        long[] leftMinSum=new long[N];
        long[] rightMaxSum=new long[N];

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        long leftSum=0;

        for(int i=0;i<n*2+1;i++){
            maxHeap.add(nums[i]);
            leftSum+=nums[i];
            if(maxHeap.size()>n){
                leftSum-=maxHeap.poll();
            }
            leftMinSum[i]=leftSum;
        }
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        long rightSum=0;
        for(int i=N-1;i>=n;i--){
            minHeap.add(nums[i]);
            rightSum+=nums[i];
            if(minHeap.size()>n){
                rightSum-=minHeap.poll();
            }
            rightMaxSum[i]=rightSum;
        }

        long result=Long.MAX_VALUE;
        for(int i=n-1;i<=2*n-1;i++){
            result=Math.min(result,leftMinSum[i]-rightMaxSum[i+1]);
        }
        return result;
    }
    public static void main(String[] args) {
        MinDiffInSumAfRemEle obj=new MinDiffInSumAfRemEle();
        int[] nums=new int[]{3,1,2};
        System.out.println(obj.minimumDifference(nums));
    }

}
