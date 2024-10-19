
    import java.util.Scanner;
    class ReportSpamMessage {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int m=Integer.parseInt(scanner.nextLine());
            String[] message=new String[m];
            int n=Integer.parseInt(scanner.nextLine());
            String[] bannedWords=new String[n];
            System.out.println(reportSpam(new String[]{"hello", "World", "Leetcode"}, new String[]{"World", "hello"}));
        }
        public static boolean reportSpam(String[] message,String[] bannedWords){
            int msgLen=message.length;
            int bannedWordsLen=bannedWords.length;
            int count=0;
            for (int i = 0; i <msgLen; i++) {
                for (int j = 0; j < bannedWordsLen; j++) {
                    if(message[i].equals(bannedWords[j])){
                        return true;
                    }
                }
                count++;
                if(count==2){
                    return true;
                }
            }
            return false;
        }

    }
