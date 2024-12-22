package programmingskills;
import java.util.HashMap;
public class FindTheDifference2 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
            if (charCount.get(c) < 0) {
                return c;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        FindTheDifference2 f = new FindTheDifference2();
        System.out.println(f.findTheDifference("abcd", "abcde"));
    }
}
