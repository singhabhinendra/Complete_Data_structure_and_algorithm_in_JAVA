import java.util.Arrays;

public class ConvertIntegerToSumOfTwoInt {
    public int[] getNoZeroIntegers(int n){
        for(int i=1;i<n;i++){
            int A=i;
            int B=n-i;
            if(hasNoZero(A) && hasNoZero(B)){
                return new int[]{A,B};
            }
        }
        return new int[]{};
    }
    public boolean hasNoZero(int A) {
        if(A==0){
            return false;
        }
        A=Math.abs(A);
        while(A>0){
            int digit = A%10;
            if(digit==0){
                return false;
            }
            A=A/10;
        }
        return true;
    }
    public static void main(String[] args) {
        ConvertIntegerToSumOfTwoInt c = new ConvertIntegerToSumOfTwoInt();
        System.out.println(Arrays.toString(c.getNoZeroIntegers(10)));
    }
}
