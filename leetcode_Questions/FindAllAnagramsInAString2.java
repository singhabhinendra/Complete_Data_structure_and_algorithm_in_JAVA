import java.util.*;
public class FindAllAnagramsInAString2 {
        public List<Integer> findAnagrams(String s, String p) {
            ArrayList<Integer> list = new ArrayList<>();
            int l1 = s.length();
            int l2 = p.length();
            if (l1 < l2) {
                return list;
            }
            int f2[] = new int[26];
            for (char ch : p.toCharArray()) {
                f2[ch - 'a'] += 1;
            }
            int[] f1 = new int[26];
            int right;
            int left = 0;
            for (right = 0; right < l2; right++) {
                char ch = s.charAt(right);
                f1[ch - 'a'] += 1;
            }
            if (check(f1, f2)) {
                list.add(left);
            }
            for (int i = right; i < l1; i++) {
                f1[s.charAt(left++) - 'a'] -= 1;
                f1[s.charAt(i) - 'a'] += 1;
                if (check(f1, f2)) {
                    list.add(left);
                }
            }
            return list;
        }

        public boolean check(int[] f1, int[] f2) {
            for (int i = 0; i < 26; i++) {
                if (f1[i] != f2[i]) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        FindAllAnagramsInAString2 f = new FindAllAnagramsInAString2();
        System.out.println(f.findAnagrams(s, p));
    }
}
