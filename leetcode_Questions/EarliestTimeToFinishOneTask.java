public class EarliestTimeToFinishOneTask {
    public static int earliestTime(int[][] tasks) {
        int t1=0,t2=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int[] time:tasks){
            t1=time[0];
            t2=time[1];
            sum=t1+t2;
            min=Math.min(sum,min);
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(earliestTime(new int[][]{{100,100},{100,100}}));
    }
}
