public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        CountingWordsWithAGivenPrefix obj = new CountingWordsWithAGivenPrefix();
        String[] words=new String[]{"pay","attention","practice","attend"};
        System.out.println(obj.prefixCount(words,"at"));
    }
}
