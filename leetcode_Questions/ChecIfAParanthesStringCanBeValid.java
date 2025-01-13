/*Example 1: locked String->"010100" s="))())": Output True:
* Example 2: locked String->"0000" s="()() :Output: true:"
//* Example 3: locked String-> s="/)" s="0":Output:false
 */

public class ChecIfAParanthesStringCanBeValid {
    public boolean canBeValid(String s,String locked){
        if(s.length()%2!=0){
            return false;
        }
        int unlockedCount=0,balance=0;
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                unlockedCount++;
            }
            else if(s.charAt(i)=='1'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance+ unlockedCount<0) return false;
        }
        unlockedCount=0;balance=0;
        for(int i=s.length()-1;i>1;i--){
            if(locked.charAt(i)=='0'){
                unlockedCount++;
            }
            else if(s.charAt(i)==')'){
                balance++;
            }
            else {
                balance--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        ChecIfAParanthesStringCanBeValid obj = new ChecIfAParanthesStringCanBeValid();
        System.out.println(obj.canBeValid("()()", "0000"));
    }
}
