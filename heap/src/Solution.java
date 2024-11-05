import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;
public class Solution {
    public static void main(String[] args) {
        Queue <Customer> customers=new PriorityQueue<>(new CustomerOrder());
        customers.add(new Customer(3, 1200.0,"abhinendra"));
        customers.add(new Customer(4, 1000.0,"Chauhan"));
        customers.add(new Customer(5, 1100.0,"Ankit "));

        System.out.println(customers);
        System.out.println(customers.poll());
        System.out.println(customers);

    }

}
