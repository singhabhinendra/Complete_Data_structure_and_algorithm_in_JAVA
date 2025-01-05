package practiced_problems;

public class CountPairsWhoseSum{
    int countPairs(int arr[], int target) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])<target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        CountPairsWhoseSum test = new CountPairsWhoseSum();
        System.out.println(test.countPairs(new int[] { 1, 2, 3, 4, 5 }, 5));
    }
}
