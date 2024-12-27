//Using Stringbuilder
//Time Complexity is:theta(n)
//Soace Complexity is:theta(n)
public class PallindromeCheck2 {
    public boolean isPallindrome(String s) {
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }
    public static void main(String[] args) {
        PallindromeCheck2 pc=new PallindromeCheck2();
        System.out.println(pc.isPallindrome("abba"));
    }
}
