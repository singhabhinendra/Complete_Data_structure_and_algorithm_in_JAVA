public class BitwiseAndOfNumberRange {
    public static int rangeBitwiseAnd(int left, int right) {
        int shift=0;
        while(left<right){
            left=left >>1;
            right=right>>1;
            shift++;
        }
        return left << shift;
    }
    public static void main(String[] args){
        System.out.println(
                rangeBitwiseAnd(5, 7));
    }
}
