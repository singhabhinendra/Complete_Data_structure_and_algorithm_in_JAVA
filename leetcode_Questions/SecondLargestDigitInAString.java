import java.util.*;
public class SecondLargestDigitInAString {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        char[] c=s.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        List<Integer> list=new ArrayList();
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){

                list.add(c[i] - '0');
            }
        }
        System.out.println(list);
        int largest=-1, secondLargest=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                secondLargest=largest;
                largest=list.get(i);
            }
            else if(list.get(i)<largest && list.get(i)!=secondLargest){
                secondLargest=list.get(i);
            }
        }
        System.out.println(secondLargest);

    }
}
