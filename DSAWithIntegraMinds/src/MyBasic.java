public class MyBasic {
    String getFullName(String firstName, String lastName) {
        return firstName+lastName;
    }
    public static void main(String[] args){
        MyBasic myBasic = new MyBasic();
        System.out.println(myBasic.getFullName("John", "Doe"));
    }
}
