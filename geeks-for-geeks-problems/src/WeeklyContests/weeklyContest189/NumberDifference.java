package WeeklyContests.weeklyContest189;

public class NumberDifference {
    public static int numdiff(int n){
    // step to achieve the difference between the n and inverted number obtained by n is:
    // 1- convert n into its binary form
    // 2- flip each digit into it's contrary
    // 3- convert flipped representation into decimal form
    // 4- Now subtract flipped decimal number from n ,result will obtain .

    int dcNum=0;
    int dcValue=0;
    // Step-1;

    String binary= Integer.toBinaryString(n);
    char[] ch=binary.toCharArray();
    // Step-2;
        for(int i=0;i<ch.length;i++){
        if(ch[i]=='0'){
            ch[i]='1';
        }
        else if(ch[i]=='1'){
            ch[i]='0';
        }
    }
    // Step-3;

        for(int i=0;i<ch.length;i++){
        int digit=Character.getNumericValue(ch[i]);
        int power=ch.length-i-1;
        dcValue=digit*(int)Math.pow(2,power);
        dcNum+=dcValue;
    }
    // Step-4;
        return n-dcNum;


}
public static void main(String[] args){
        NumberDifference diff = new NumberDifference();
        System.out.println(diff.numdiff(4));
}

}
