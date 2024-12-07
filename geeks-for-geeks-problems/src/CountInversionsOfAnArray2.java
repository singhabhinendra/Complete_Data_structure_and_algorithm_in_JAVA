/*[Expected Approach] Using Merge Step of Merge Sort -O(n*logn) Time and O(n) Space:
we can use merge sort to count the inversions in an Array.First,we divide the array into
two halves;left half and right half.Next, We recursively count the inversions in both halves
.While merging the two halves back together,we also count how many elements from the left half
array are greater than elements from the right half array, as these represent cross inversions(i.e.,
element from the left half of the array is greater than an element from the right half during the merging
process in the merge sort algorithm). Finally, we sum the inversions from the left half,right half, and the
cross inversions to get the total number of inversions in the array.This approach efficiently counts inversions
while sorting the array.
Let's understand the above intuition in more detailed form, as we get to know that we have to perform the merge sort
on the given array. Below images represents dividing and merging steps of merge sort.

* */
import java.util.Scanner;
public class CountInversionsOfAnArray2 {
    static int countAndMerge(int[] arr, int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]= arr[m+1+j];
        }
        int res=0;
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k]=left[i];
            }
            else{
                arr[k]=right[j++];
                res+=(n1-i);
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return res;
    }
    static int countInv(int[] arr, int l, int r){
        int res=0;
        if(l<r){
            int m=(r+l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,r);
            res+=countAndMerge(arr,l,m,r);
        }
        return res;
    }
    static int inversionCount(int[] arr){
        return countInv(arr,0,arr.length-1);
    }
    public static void main(String[] args){
        int[] arr={4,3,2,1};
        System.out.println(inversionCount(arr));
    }
}
