import java.util.Arrays;

public class SwapAndSort {
    public void mergeArrays(int a[], int b[]) {
        int i=a.length-1;
        int j=0;
        while(i >=0 && j < b.length){
            if( a[i] < b[j]){
                i--;
            }
            else{
                int temp= b[j];
                b[j] = a[i];
                a[i]= temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        SwapAndSort swapAndSort = new SwapAndSort();

        int[] a={1,5,9,10,15,20};
        int[] b={2,3,8,13};
        swapAndSort.mergeArrays(a,b);
        for(int c:a){
            System.out.print(c+" ");
        }
        System.out.println();
        for(int e:b){
            System.out.print(e+" ");
        }
        swapAndSort.mergeArrays(new int[]{2,4,7,10},new int[]{2,3});

    }
}
