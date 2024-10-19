import java.util.Scanner;


public class CharacterHashing {
    public static void main(String[] args) {
        System.out.println("input a String");
        Scanner sc=new Scanner(System.in);
        String string =sc.nextLine();
       int[] hash=new int [26];
        for (int i = 0; i <string.length(); i++) {
            hash[string.charAt(i) - 'a']++;
            System.out.println(hash[string.charAt(i) - 'a']);
        }

        int q= sc.nextInt();
        while(q>0){
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
            q--;
        }

    }
}
