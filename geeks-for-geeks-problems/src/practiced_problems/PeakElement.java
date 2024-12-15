package practiced_problems;

//[Naive Approach] Using Linear Search – O(n) Time and O(1) Space
public class PeakElement {
    public int peakElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean left=true,right=true;
            if(i>0 && arr[i]<=arr[i-1]){
                left=false;
            }
            if(i<arr.length-1 && arr[i]<=arr[i+1]){
                right=false;
            }
            if(left && right){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        PeakElement peakElement = new PeakElement();
        System.out.println(peakElement.peakElement(new int[]{1,2,4,5,7,8,3}));
    }
}
