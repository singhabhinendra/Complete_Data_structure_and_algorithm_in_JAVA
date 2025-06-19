import java.util.*;
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            // Remove left char from window if it's beyond the window size
            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }

            // Compare frequency arrayswq
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }
    public static void main(String[] args){
        FindAllAnagramsInAString f = new FindAllAnagramsInAString();
        System.out.println(f.findAnagrams("babad", "bab"));
    }
}
