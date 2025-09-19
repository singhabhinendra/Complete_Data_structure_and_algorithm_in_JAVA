public class SmallestAbsentPositiveGreaterThanAverage {
    public static void main(String[] args) {
     System.out.println(smallestAbsent(new int[]{-1,1,2}));
    }public static int smallestAbsent(int[] nums) {
        int sum=0;
        int avg=0;
        for(int i:nums){
            sum+=i;
        }
        avg=sum/nums.length;
        for(int i:nums){
            if(avg+1==i){
                return avg+2;
            }
        }
        return avg+3;
    }
}
