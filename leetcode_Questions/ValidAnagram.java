import java.util.Arrays;
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String S = String.copyValueOf(s1);
        String T = String.copyValueOf(s2);

        if(T.contains(S)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
    }

}
