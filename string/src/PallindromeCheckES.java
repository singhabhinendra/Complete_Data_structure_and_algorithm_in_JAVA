public class PallindromeCheckES {
    public static void main(String[] args) {
    System.out.println(isPallindrome("ababa"));
    }
    public static boolean isPallindrome(String word) {
        int len = word.length();
        int start=0 ; int end=len-1;
        while(start<=end){
           if(word.charAt(start)!=word.charAt(end)){
                return false;
           }
           start++;
           end--;

        }
        return true;
    }
}
