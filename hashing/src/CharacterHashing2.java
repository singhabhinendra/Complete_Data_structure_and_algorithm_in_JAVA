// Hash Table is all about hashing and precompute and fetching.

import java.util.Scanner;
public class CharacterHashing2 {
    public static void main(String[] args) {
        String input;
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextLine();
        int[] hash=new int[256];
        //precompute
        for (int i = 0; i <input.length(); i++){
            hash[input.charAt(i)]++;
        }
        int query;
        query=scanner.nextInt();
        while(query>0){
            char c;
            c=scanner.next().charAt(0);
//            fetching
            System.out.println(hash[c]);
            query--;
        }
    }
}
