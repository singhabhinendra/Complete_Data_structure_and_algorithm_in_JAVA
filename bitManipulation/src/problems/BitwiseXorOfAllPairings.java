package problems;

public class BitwiseXorOfAllPairings {
    public int XorAllNums(int[] nums1,int[] nums2){
        int result=0;
        int [] xorEle=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length-1;j++){
                xorEle[i+j]=nums1[i]^nums2[j];
            }
        }
        for (int j : xorEle) {
            result ^= j;
        }
        return result;
    }
    public static void main(String[] args){
        BitwiseXorOfAllPairings b=new BitwiseXorOfAllPairings();
        System.out.println(b.XorAllNums(new int[]{1,2},new int[]{3,4}));
    }
}
