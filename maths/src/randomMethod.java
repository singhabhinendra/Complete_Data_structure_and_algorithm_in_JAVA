import java.util.Random;
public class randomMethod {
    public static void main(String[] args){
        Random randomNum=new Random();
        int showMe=randomNum.nextInt(0,100);
        System.out.println("Random number between 1 and 100 :"+ showMe);
    }
}
