import java.util.Scanner;
import java.util.Stack;
public class OptimisedFinancilaTransCallForStockTradPostFix {
    public static int calculate(String[] tokens){
        Stack<Integer> stack =new Stack<>();
        for(String token:tokens){
            switch(token){
                case"+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int sub1=stack.pop();
                    int sub2=stack.pop();
                    stack.push(sub2-sub1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor=stack.pop();
                    int dividend= stack.pop();
                    stack.push(dividend/divisor);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;

            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] tokens=input.trim().split("\\s+");
        int result=calculate(tokens);
        System.out.println(result);
    }
}
