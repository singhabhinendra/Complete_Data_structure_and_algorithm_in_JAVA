package problems;

public class BitwiseXorOfAllPairings3 {
    public static void main(String[] args) {
        BitwiseXorOfAllPairings3 obj = new BitwiseXorOfAllPairings3();
        System.out.println(obj.getSolution(new int[]{2,1,3},new int[]{10,2,5,0}));
    }
    public static int getSolution(int[] nums1,int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int XOR=0;
        if(m%2!=0){
            for(int num:nums2){
                XOR^=num;
            }
        }
        if(n%2!=0){
            for(int num:nums1){
                XOR^=num;
            }
        }
        return XOR;
    }
}
