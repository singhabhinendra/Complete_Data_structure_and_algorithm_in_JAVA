
    import java.util.Scanner;
    public class TechnicalSupport {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int test=scanner.nextInt();
            while(test-->0){
                int n=scanner.nextInt();
                char[] ch=scanner.next().toCharArray();
                int q=0,a=0;
                for(int j=0;j<n;j++){
                    if(ch[j]=='Q')q++;
                    else q=Math.max(0,q-1);
                }
                if(q==0)System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
