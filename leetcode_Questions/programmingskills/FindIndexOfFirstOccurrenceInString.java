package programmingskills;

public class FindIndexOfFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindIndexOfFirstOccurrenceInString f = new FindIndexOfFirstOccurrenceInString();
        System.out.println(f.strStr("hello", "ll"));
    }
}
