public class MaxChunksToSortedArray {
    public int maxChunksToSorted(int[] arr) {
        int max=0;
        int chunk=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(i==max){
                chunk++;
            }
        }
        return chunk;
    }
    public static void main(String[] args) {
        MaxChunksToSortedArray maxChunksToSortedArray = new MaxChunksToSortedArray();
        System.out.println(maxChunksToSortedArray.maxChunksToSorted(new int[]{1,2,3,4,5}));
    }
}
