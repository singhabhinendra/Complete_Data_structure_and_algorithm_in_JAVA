package dynamicArrays.Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Example {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        list.add(34);
//        list.add(45);
//        list.add(5);
//        list.add(54);
//        list.add(43);
//
//        System.out.println(list.contains(343));
//        list.set(0,99);
//        System.out.println(list.contains(99));
//        list.remove(2);
//        System.out.println(list);
        ArrayList<Integer> list=new ArrayList<>();
//        input
        for(int i=0;i<5;i++){
            list.add(scanner.nextInt());
        }
//        ouptut
//        get item at any index;
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
