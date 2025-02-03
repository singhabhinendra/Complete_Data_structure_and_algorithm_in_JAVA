import java.util.*;
public class WordSorter {
    // Comparator: Sort by difference, then lexicographically if differences are the same
    static class Pair {
        String word;
        int difference;

        Pair(String word, int difference) {
            this.word = word;
            this.difference = difference;
        }
    }
    static class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair a, Pair b) {
            if (a.difference == b.difference) {
                return a.word.compareTo(b.word); // Lexicographical order if differences are equal
            }
            return Integer.compare(a.difference, b.difference); // Sort by difference
        }
    }
    // Function to check if a character is a vowel
    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    // Function to process sentence and return sorted words
    static List<String> solve(String sentence) {
        List<String> result = new ArrayList<>();
        List<Pair> wordsList = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int vowelCount = 0, consonantCount = 0;
        for (char ch : sentence.toCharArray()){
            if (ch != ' ') {
                word.append(ch);
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                // Word has ended
                if (!word.isEmpty()) {
                    int diff = Math.abs(vowelCount - consonantCount);
                    wordsList.add(new Pair(word.toString(), diff));
                }
                // Reset for next word
                word.setLength(0);
                vowelCount = 0;
                consonantCount = 0;
            }
        }
        // Add the last word if any
        if (!word.isEmpty()) {
            int diff = Math.abs(vowelCount - consonantCount);
            wordsList.add(new Pair(word.toString(), diff));
        }
        // Sort the wordsList using the comparator
        wordsList.sort(new PairComparator());
        // Extract sorted words into result list
        for (Pair p : wordsList) {
            result.add(p.word);
        }
        return result;
    }
    public static void main(String[] args) {
        String sentence = "this is a sentence";
        List<String> sortedWords = solve(sentence);
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
