public class MergeSort {
    public static void main(String[] args) {
        int[] arr1={1,4,6,8};
        int[] arr2={2,5,7,9};
        int[] arr={1,2,19,12,11,10,8,18,20};

    }
    public static int[] mergeSort(int[] arr1,int low,int hi){
        if(low == hi){
            int[] a=new int[1];
            a[0]=a[low];
            return a;
        }
        int mid=(low+hi)/2;
        int[] fh=mergeSort(arr1,low,mid);
        int[] sh=mergeSort(arr1,mid+1,hi);
        return merge(fh,sh);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int i=0,j=0,k=0;
        int[] ans=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}
