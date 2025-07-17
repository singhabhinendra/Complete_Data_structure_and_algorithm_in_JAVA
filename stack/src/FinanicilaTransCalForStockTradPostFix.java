import java.util.Scanner;
import java.util.Stack;
public class FinanicilaTransCalForStockTradPostFix {
    public static int calculate(String[] tokens) {
        Stack <Integer> stack =new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int first =stack.pop();
                int second=stack.pop();
                int result=first+second;
                stack.push(second);
                stack.push(first);
                stack.push(result);
            }
            else if(token.equals("-")){
                int first =stack.pop();
                int second=stack.pop();
                stack.push(second);
                stack.push(first);
                stack.push(second-first);
            }
            else if(token.equals("*")){
                int first =stack.pop();
                int second=stack.pop();
                stack.push(second);
                stack.push(first);
                stack.push(second*first);
            }
            else if (token.equals("/")){
                int first =stack.pop();
                int second=stack.pop();
                stack.push(second);
                stack.push(first);
                stack.push(second/first);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] tokens=input.split(" ");
        int finalBalance=calculate(tokens);
        System.out.println(finalBalance);
        sc.close();
    }
}
