import java.util.Stack;
public class MinimumStringLengthAfterRemovingSubstrings {
        public int minLength(String s) {
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {
                // Check for "AB" or "CD" pairs and pop if they match
                if (!stack.isEmpty() && ((stack.peek() == 'A' && ch == 'B') || (stack.peek() == 'C' && ch == 'D'))) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            // The size of the stack represents the remaining characters
            return stack.size();
        }
        public static void main(String[] args){
            MinimumStringLengthAfterRemovingSubstrings m = new MinimumStringLengthAfterRemovingSubstrings();

            // Test cases
            String test1 = "ABCD";
            String test2 = "AABBCCDD";
            String test3 = "ACBD";
            String test4 = "ABABCDCD";

            System.out.println("Remaining length after removing pairs in \"" + test1 + "\": " + m.minLength(test1));
            System.out.println("Remaining length after removing pairs in \"" + test2 + "\": " + m.minLength(test2));
            System.out.println("Remaining length after removing pairs in \"" + test3 + "\": " + m.minLength(test3));
            System.out.println("Remaining length after removing pairs in \"" + test4 + "\": " + m  .minLength(test4));
        }
}