package basic_programs;

public class RemoveEachWordInASentence {
    public static void main(String[] args) {
        String input="This is a test";
        String[] words=input.split("");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            result.append(new StringBuilder(word).reverse().toString());
        }
        System.out.println(result.toString().trim());
    }
}
