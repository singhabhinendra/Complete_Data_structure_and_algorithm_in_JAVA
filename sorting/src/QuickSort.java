public class QuickSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(partition(arr));

    }
    public static int partition(int [] arr){
        int pivot =arr[arr.length-1];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<pivot){
                idx++;
            }
        }
        return idx;
    }
}
