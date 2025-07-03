package AlgoForArrays.kadaneAlgo;

public class Code {
    public static int maxSubarraySum(int[] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-2,1,-3,4,-1,2,1}));
    }
}
