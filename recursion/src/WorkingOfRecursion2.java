public class WorkingOfRecursion2 {
    public static void main(String[] args) {
        WorkingOfRecursion2 obj = new WorkingOfRecursion2();
        obj.print();
    }
    int count=0;
    void print(){
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        print();

    }
}
