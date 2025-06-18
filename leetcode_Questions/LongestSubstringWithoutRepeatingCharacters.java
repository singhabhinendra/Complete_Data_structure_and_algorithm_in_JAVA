import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        int left=0;
        int maxLen=0;
        HashSet<Character> seen=new HashSet<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    public static void main(String [] args){
        String s="abcabcbb";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
}
