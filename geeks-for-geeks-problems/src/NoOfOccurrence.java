 class NoOfOccurrence {
        int countFreq(int[] arr, int target) {
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {
        NoOfOccurrence noOfOccurrence = new NoOfOccurrence();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(noOfOccurrence.countFreq(arr, 9));
    }
}
