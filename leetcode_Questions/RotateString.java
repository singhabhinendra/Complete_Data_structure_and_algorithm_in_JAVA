
    public class RotateString {
        public boolean rotateString(String s, String goal) {
            return ((s.length()==goal.length()) && (s+s).contains(goal));
        }

        public static void main(String[] args) {
            RotateString rotateString = new RotateString();
            System.out.println(rotateString.rotateString("abcde", "cdeab"));
        }
    }

