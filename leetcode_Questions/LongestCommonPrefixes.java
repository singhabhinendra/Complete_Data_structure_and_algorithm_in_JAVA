import java.util.Arrays;
    import java.util.Arrays;
    public class LongestCommonPrefixes {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String str2=strs[strs.length-1];
            String str1=strs[0];
            int i = 0;
            if (strs == null || strs.length == 0) {
                return "";
            }
            while (i < str1.length() && i < str2.length()) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    break;
                }
                i++;
            }
            return str1.substring(0, i);
        }

        public static void main(String[] args) {
            LongestCommonPrefixes longestCommonPrefixes = new LongestCommonPrefixes();
            System.out.println(longestCommonPrefixes.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        }
    }

