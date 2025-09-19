package practiced_problems;

public class KthMissingPositiveNoInSortedArr {
    public int kthMissing(int[] arr, int k) {
        int n = arr.length;
        for(int i=0 ; i < n ; i++){
            if(arr[i] > (k + i)){
                return (k+i);
            }
        }
        return k+n;
    }
    public static void main(String[] args) {
        KthMissingPositiveNoInSortedArr obj=new KthMissingPositiveNoInSortedArr();
        System.out.println(obj.kthMissing(new int[]{2,3,4,7,11},5));
    }
}
