package practiced_problems;

public class MergeTwoSortedArray {
    public void merge(int[] a,int[] b){
        for(int i=b.length-1;i>=0;i--){
            if(a[a.length-1]>b[i]) {
                int last = a[a.length - 1];
                int j = a.length - 2;
                while (j >= 0 && a[j] >= b[i]) {
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=b[i];
                b[i]=last;
            }
        }
    }
    public static void main(String[] args){
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        int[] a={1,5,9,10,15,20};
        int[] b={2,3,8,13};
        mergeTwoSortedArray.merge(a,b);
        for(int c:a){
            System.out.print(c+" ");
        }
        System.out.println();
        for(int e:b){
            System.out.print(e+" ");
        }
    }
}
