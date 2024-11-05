public class FindSmallestGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int firstIndex=0;
        int lastIndex=letters.length;
        while(firstIndex<lastIndex){
            int mid=firstIndex+(lastIndex-firstIndex)/2;
            if(letters[mid]>target){
                if(letters[mid-1]>target){
                    return (char)(letters[mid-1]);
                }
                return (char)(letters[mid]);
            }
            else if(letters[mid]<target){
                firstIndex=mid+1;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        FindSmallestGreaterThanTarget obj = new FindSmallestGreaterThanTarget();
        System.out.println(obj.nextGreatestLetter(new char[]{'x','x','y','y'}/*{'c', 'f', 'j'}*/, 'j'));
    }
}
