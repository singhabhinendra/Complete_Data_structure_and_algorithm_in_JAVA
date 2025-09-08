import java.util.Scanner;
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int[] nElem=new int[n];
            boolean flag=false;
            for(int j=0;j<n;j++){
                nElem[j]=scanner.nextInt();
            }
            for(int p=0;p<n;p++){
                if(nElem[p]==k){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
