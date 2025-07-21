import java.util.* ;
import java.io.*;
class Node2{
    Node2[] links=new Node2[26];
    boolean flag=false;
    public Node2(){
    }
    boolean containKey(char ch){
        return (links[ch-'a']!=null);
    }

    Node2 get(char ch){
        return links[ch-'a'];
    }
    void put(char ch,Node2 node) {
        links[ch - 'a'] = node;
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
}
class Trie{
    private Node2 root;
    public Trie(){
        root=new Node2();
    }

    public void insert (String word){
        Node2 node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containKey(word.charAt(i))){
                node.put(word.charAt(i),new Node2());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }
    boolean checkPrefixExists(String word){
        Node2 node =root;
        boolean flag=true;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
                flag=flag & node.isEnd();
            }
            else{
                return false;
            }
        }
        return flag;
    }

}


public class CompleteString {

    public static String completeString(int n, String[] a) {
        Trie obj=new Trie();
        for(int i=0;i<n;i++){
            obj.insert(a[i]);
        }
        String longest="";
        for(int i=0;i<n;i++){
            if(obj.checkPrefixExists(a[i])){
                if (a[i].length() > longest.length()) {
                    longest = a[i];
                }
                else if(a[i].length()==longest.length()&&a[i].compareTo(longest)<0){
                    longest=a[i];
                }
            }

        }
        if(longest.equals("")){
            return "None";
        }
        return longest;
    }
}
