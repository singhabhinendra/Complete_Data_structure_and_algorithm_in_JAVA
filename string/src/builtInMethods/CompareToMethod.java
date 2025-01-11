package builtInMethods;

public class CompareToMethod {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="for";
        int res=s1.compareTo(s2);
        if(res==0){
            System.out.println("s1 is equal to s2");
        }
        if(res>0){
            System.out.println("s1 is greater than s2");
        }
        if(res<0){
            System.out.println("s1 is less than s2");
        }
    }
}
