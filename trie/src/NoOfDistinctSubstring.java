import java.util.* ;
import java.io.*;
class Node3{
    Node3[] links = new Node3[26];
    boolean flag = false;

    public Node3() {
    }

    boolean containKey(char ch) {
        return (links[ch - 'a'] != null);
    }

    Node3 get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node3 node) {
        links[ch - 'a'] = node;
    }
}

public class NoOfDistinctSubstring {
    public static int countDistinctSubstrings(String s)
    {
        Node3 root=new Node3();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            Node3 node=root;
            for(int j=i;j<n;j++){
                if(!node.containKey(s.charAt(j))){
                    node.put(s.charAt(j),new Node3());
                    count++;
                }
                node=node.get(s.charAt(j));
            }
        }
        return count+1;
    }
    public static void main(String[] args){
        NoOfDistinctSubstring test= new NoOfDistinctSubstring();
        System.out.println(test.countDistinctSubstrings("sds"));
    }
}
