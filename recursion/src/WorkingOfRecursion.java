//This Class defines how Recursion is used in any programming language and what is significance in programming language.How it can be better than iterative approach (Using Loop) .
//In this, we discussed about How call stack is used in while recursion is happening .How the recursion tree is helpful in prgramming .It helps to get some insights how recursion is used.
public class WorkingOfRecursion {
    public static void main(String[] args) {
        WorkingOfRecursion workingOfRecursion = new WorkingOfRecursion();
        workingOfRecursion.function();
    }
    void function(){
        System.out.println("1");
        function();
    }
}
