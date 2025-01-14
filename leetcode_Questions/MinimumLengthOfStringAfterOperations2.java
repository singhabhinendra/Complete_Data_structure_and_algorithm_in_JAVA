public class MinimumLengthOfStringAfterOperations2 {
    public int minimumLength(String s){
        int n=s.length();
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']+=1;
        }
        int result=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                continue;
            }
            else if(freq[i]%2==0){
                result+=2;
            }
            else {
                result+=1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MinimumLengthOfStringAfterOperations2 solution = new MinimumLengthOfStringAfterOperations2();
        System.out.println(solution.minimumLength("abaacbcbb"));
    }
}
