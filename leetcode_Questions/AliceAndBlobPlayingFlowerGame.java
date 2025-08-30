import java.util.Scanner;
public class AliceAndBlobPlayingFlowerGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(flowerGame(n, m));

    }
        public static long flowerGame(int n, int m) {
            return ((long)((n + 1) / 2) * (m / 2)) + ((long)(n / 2) * ((m + 1) / 2));
        }

}
