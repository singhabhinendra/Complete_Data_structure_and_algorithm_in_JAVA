public class HIndex {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int [] arr=new int [n+1];
        for(int c:citations){
            if(c>n){
                arr[n]++;
            }
            else{
                arr[c]++;
            }
        }
        int count=0;
        for(int i=n;i>=0;i--){
            count+=arr[i];
            if(count>=i)
                return i;

        }
        return 0;
    }
    public static void main(String[] args) {
        HIndex hIndex=new HIndex();
        int[] citations=new int[]{1,2,3,4,5};
        System.out.println(hIndex.hIndex(citations));
    }
}
