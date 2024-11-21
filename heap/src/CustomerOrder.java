import java.util.Comparator;

public class CustomerOrder implements Comparator <Customer> {
    public int compare(Customer o1, Customer o2){
        return o1.getAmount()<o2.getAmount()?1:-1;
    }
}
