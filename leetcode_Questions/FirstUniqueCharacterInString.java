
    public class FirstUniqueCharacterInString {
        public int firstUniqChar(String s) {
            // int[] arr=s.charArray;
            int result=Integer.MAX_VALUE;
            for(char c='a';c<='z';c++){
                int index=s.indexOf(c);
                if(index!=-1 && index==s.lastIndexOf(c)){
                    result=Math.min(result,index);
                }

            }
            return result==Integer.MAX_VALUE?-1:result;
        }

        public static void main(String[] args) {
            FirstUniqueCharacterInString f=new FirstUniqueCharacterInString();
            System.out.println(f.firstUniqChar("leetcode"));
        }
    }

