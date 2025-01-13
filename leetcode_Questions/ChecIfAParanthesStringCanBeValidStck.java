/*Time Complexity of this problem statememt  is TC:(O(n))
* Space complexity of this problem statement is TC: (O(n)):*/
import java.util.Stack;
public class ChecIfAParanthesStringCanBeValidStck {
    public boolean canBeValid(String s,String locked) {
        int n=s.length();
        if(n%2!=0) return false;
//        SC:O(n);
        Stack<Integer> open=new Stack<Integer>();
        Stack <Integer> openClose=new Stack<Integer>();
//        tc:O(n)
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                openClose.push(i);
            }
            else if(s.charAt(i)=='('){
                open.push(i);
            }
            else if(s.charAt(i)==')'){
                if(!open.isEmpty()){
                    open.pop();
                }
                else if(!openClose.isEmpty()){
                    openClose.pop();
                }
                else{
                    return false;
                }
            }

        }
//        TC:O(n);
        while(!open.isEmpty() && !openClose.isEmpty() && open.peek() < openClose.peek()){
            open.pop();
            openClose.pop();
        }
        return open.isEmpty();
    }
}
