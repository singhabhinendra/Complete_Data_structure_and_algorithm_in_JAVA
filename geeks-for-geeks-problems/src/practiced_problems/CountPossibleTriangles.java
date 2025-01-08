package practiced_problems;

public class CountPossibleTriangles {
    static int countTriangles(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]>arr[k]&& arr[i]+arr[k]>arr[j]&& arr[k]+arr[j]>arr[i]){
                        res++;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={4,6,3,7};
        System.out.println(countTriangles(arr));
    }
}
