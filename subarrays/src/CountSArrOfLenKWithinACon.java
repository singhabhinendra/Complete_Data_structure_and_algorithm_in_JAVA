public class CountSArrOfLenKWithinACon {
    public static void main(String[] args) {
        int[] nums = {-1,-4,-1,4};
        int N=nums.length;
        int k=3;
        int e=N-k+1;
        int start=0,end=2;
        int count=0;
        while(e>0){
            for(int i=start;end<N;i++){
                if (2*(nums[i] + nums[end]) == (nums[i+1]))
                    count+=1;
                start++;
                end++;
            }
            e--;
        }
        System.out.println(count);
    }
}
