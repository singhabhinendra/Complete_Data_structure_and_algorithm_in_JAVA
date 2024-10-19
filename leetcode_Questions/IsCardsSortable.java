
    import java.util.Scanner;
    public class IsCardsSortable {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int t=scanner.nextInt();
            String s=scanner.next();

            for(int i=0;i<t;i++){
                if(isCardsSortable(s)){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
            }
        }
        public static boolean isCardsSortable(String s) {
            if(s.charAt(0)=='a') return true;
            if(s.charAt(1)=='b') return true;
            if(s.charAt(2)=='c') return true;
            return false;
        }
    }


