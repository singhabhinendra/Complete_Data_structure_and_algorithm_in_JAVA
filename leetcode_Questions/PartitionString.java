import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class PartitionString {
    public static  List<String> partitionString(String s) {
        int n = s.length();
        List<String> segments = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        int i = 0;

        while (i < n) {
            boolean found = false;
            StringBuilder cur = new StringBuilder();
            for (int j = i; j < n; j++) {
                cur.append(s.charAt(j));
                if (!seen.contains(cur.toString())) {
                    found = true;
                    segments.add(cur.toString());
                    seen.add(cur.toString());
                    i = j + 1;
                    break;
                }
            }
            if (!found) break;
        }

        return segments;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(partitionString(s));

    }
}
