import singlyLinkedList.LinkedList;
public class AddTwoNumbers {
    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2){
        while(l1.nextNode!=null && l2.nextNode!=null){
            l1.val= l1.val+l2.val;
            while(l1.val!=0){
                int firstDigit=Math.abs(l1.val%10);
                l1.val=l1.val/=10;
            }
            l1= l1.nextNode;
            l2= l2.nextNode;
        }
        return l1;
    }


    public static void main(String[] args) {
            LinkedList l1=new LinkedList(2);
            l1=new LinkedList(4);
            l1=new LinkedList(3);
            LinkedList l2=new LinkedList(5);
            l2=new LinkedList(6);
            l2=new LinkedList(4);
            System.out.println(addTwoNumbers(l1,l2));
    }

}
