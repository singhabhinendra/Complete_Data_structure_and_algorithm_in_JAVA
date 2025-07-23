public class MaximumScoreFromRemString {
    public int maximumGain(String s, int x, int y){
        StringBuilder sb=new StringBuilder(s);
        int result=0;
//        Decide which pair to remove first:higher gain has
//        priorty
                String first =x>=y ?"ab":"ba";
        int firstVal= x>=y?x:y;
        String second= x>=y?"ba":"ab";
        int secondVal= x>=y?y:x;
        result+= removePairs(sb,first,firstVal);
        result+= removePairs(sb,second,secondVal);
        return result;
    }
    private int removePairs(StringBuilder sb,
                            String pair,
                            int val){
        int gain=0;
        int i=0;
        while(i<sb.length()-1){
            if(sb.charAt(i)== pair.charAt(0) &&
            sb.charAt(i+1)==pair.charAt(1)){
                sb.delete(i,i+2);
                gain+=val;
                if(i>0) i--;
            }
            else{
                i++;
            }
        }
        return gain;
    }

    public static void main(String[] args) {
        MaximumScoreFromRemString ms=new MaximumScoreFromRemString();
        System.out.println(ms.maximumGain("cdbcbbaaabab", 4, 5));
    }
}
