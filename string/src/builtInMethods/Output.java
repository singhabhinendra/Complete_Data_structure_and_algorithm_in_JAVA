package builtInMethods;

public class Output {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="geeks";
        s1=s1 +"forgeeks"; // or s1=s1.concat("forgeeks");
        System.out.println(s1);
        System.out.println(s1==s2)  ;
    }

}
