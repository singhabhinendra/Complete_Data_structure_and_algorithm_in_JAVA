package WeeklyContests.weeklyContest189;

public class ConvertString {
    public boolean isPossible(String s,String t){
//        check if initial characters match
        int i=0,j=0,n=s.length(),m=t.length();
        while(i<n && j<m && t.charAt(j)==s.charAt(i)){
            if(s.charAt(i)!=t.charAt(j)){
                return false;
            }
            j++;
            i++;

        }
        if(j>=n) return false;
        while (i<n && j<m){
            if(s.charAt(i) ==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n;
    }
    public static void main(String[] args){
        ConvertString obj = new ConvertString();
        System.out.println(obj.isPossible("abc", "abbcc"));
    }
}
