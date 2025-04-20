package singlyLinkedList;
public class LinkedList{
    public int val;
    LinkedList node;
    public LinkedList nextNode;
    public LinkedList(LinkedList node,LinkedList nextNode,int val){
        this.val=val;
        this.node=node;
        this.nextNode=nextNode;
    }
    public LinkedList(int val){
        this.val= val;
        this.node= null;
        this.nextNode= null;
    }
    public LinkedList(){
        this.val= 0;
        this.node=null;
        this.nextNode=null;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "data=" + val +
                ", node=" + node +
                ", nextNode=" + nextNode +
                '}';
    }
}