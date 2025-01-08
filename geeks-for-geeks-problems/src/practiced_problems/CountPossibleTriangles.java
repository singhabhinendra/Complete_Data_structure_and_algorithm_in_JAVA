/*[Naive Approach] Checking all Triplets – O(n^3) Time and O(1) Space

A simple approach is to run three nested loops that select three
different values from an array. And in the innermost loop,
 we check for the triangle property which specifies the sum of
any two sides must be greater than the value of the third side.
*/
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
