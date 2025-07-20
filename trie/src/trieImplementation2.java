import java.util.* ;
import java.io.*;
class Node1{
    Node1 links[]=new Node1[26];
    int cntEndWith=0;
    int cntPrefix=0;
    public Node1(){

    }
    boolean containKey(char ch){
        return (links[ch-'a']!=null);
    }
    Node1 get(char ch){
        return links[ch-'a'];
    }
    void put(char ch,Node1 node){
        links[ch-'a']=node;
    }
    void increaseEnd(){
        cntEndWith++;
    }
    void increasePrefix(){
        cntPrefix++;
    }
    void deleteEnd(){
        cntEndWith--;
    }
    void reducePrefix(){
        cntPrefix--;
    }
    int getEnd(){
        return cntEndWith;
    }
    int getPrefix(){
        return cntPrefix;
    }
}
public class trieImplementation2{
    private Node1 root;
    public trieImplementation2() {
        root=new Node1();
    }

    public void insert(String word) {
        Node1 node1 =root;
        for(int i=0;i<word.length();i++){
            if(!node1.containKey(word.charAt(i))){
                node1.put(word.charAt(i),new Node1());
            }
            node1=node1.get(word.charAt(i));
            node1.increasePrefix();
        }
        node1.increaseEnd();
    }

    public int countWordsEqualTo(String word) {
        Node1 node =root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }
            else{
                return 0;
            }
        }
        return node.getEnd();
    }

    public int countWordsStartingWith(String word) {
        Node1 node=root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }
            else{
                return 0;
            }
        }
        return node.getPrefix();
    }

    public void erase(String word) {
        Node1 node=root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
                node.reducePrefix();
            }
            else{
                return;
            }
        }
        node.deleteEnd();
    }
}
