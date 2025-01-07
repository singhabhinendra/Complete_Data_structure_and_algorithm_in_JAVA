//Time Complexity of the Problem is : First time complexity to make array sorted will be O(logn) because we use built in class .
//Second time Complexity for using a For Loop for finding Can Make Arithmetic Progression From sequence is or not:
//Hence The Total complexity will be : O(logn) + O(n).
package programmingskills;
import java.util.Arrays;
public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=Math.abs(arr[1]-arr[0]);
        boolean result=false;
        for(int i=0;i<arr.length;i++){
            if(i+1<=arr.length-1){
                if(Math.abs(arr[i+1]-arr[i])==diff ){
                    result=true;
                }
                else{
                    return result=false;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence obj = new CanMakeArithmeticProgressionFromSequence();
        System.out.println(obj.canMakeArithmeticProgression(new int[]{3,4,1,2}));
    }
}
