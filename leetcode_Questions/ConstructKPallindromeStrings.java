public class ConstructKPallindromeStrings {
    public static void main(String[] args){
        System.out.println(canConstruct("true",4));
    }
    public static boolean canConstruct(String s, int k){
        if(s.length()==k){
            return true;
        }
        return false;
    }
}
