 import java.util.Scanner;
    public class CheckCardsPossibility {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int t=scanner.nextInt();
            while(t>0){
                String s=scanner.next();
                if(s.equals("bca")||s.equals("cab")){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }
        }
    }
