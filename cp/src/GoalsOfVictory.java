import java.util.*;
public class GoalsOfVictory {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int t=scanner.nextInt();

        for(int i=0;i<t;i++){
            int n=scanner.nextInt();
            int[] nEfficiency=new int[n];
            int misEff=0;
            for(int j=0;j<n-1;j++){
                nEfficiency[j]=scanner.nextInt();
            }
            for(int k=0;k<n-1;k++){
                misEff+=nEfficiency[k];
            }
            System.out.println(-(misEff));
        }
    }
}
