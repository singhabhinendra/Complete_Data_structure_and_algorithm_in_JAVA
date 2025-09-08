import java.util.*;
public class AmbitiousKid {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int t=scanner.nextInt();
            for(int i=0;i<t;i++){
                int N=scanner.nextInt();
                int[] arr=new int[N];
                for(int k=0;k<N;k++){
                    arr[k]=scanner.nextInt();
                }
                System.out.println(NoOfOpOfAmbitiousKid(arr));
            }
        }
        public static int NoOfOpOfAmbitiousKid(int[] arr) {
            int min = Integer.MAX_VALUE;
            if (arr.length == 1) {
                return Math.abs(arr[0]);
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    return 0;
                } else {
                    min = Math.min(Math.abs(arr[i]), min);
                }
            }
            return min;
        }
}
