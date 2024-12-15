package practiced_problems;

/*Complexity Analysis:
    Time Complexity: O(n).
    Since only three traversals through the array is needed, So the time complexity is linear.
    Space Complexity: O(1).
    As no extra space is required, so the time complexity is constant.
*/
public class IndexOfAnExtraElement3 {
    static int find_extra(int[] arrA,int[] arrB){
        int exEle=sum(arrA)-sum(arrB);
        return indexOf(arrA,exEle);
    }
    static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int indexOf(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arrA={3,5};
        int[] arrB={3};
        System.out.println(find_extra(arrA, arrB));
    }
}
