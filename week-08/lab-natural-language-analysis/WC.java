import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WC {
    public static void main(String[] args) {
        if (args[0].equals("-w")) {
            System.out.println(wordCount(args[1]));
        }

        if (args[0].equals("-m")) {
            System.out.println(charCount(args[1]));
        }

        if (args[0].equals("-l")) {
            System.out.println(lineCount(args[1]));
        }

        if (args[0].equals("-s")) {
            System.out.println(lexicalDiversity(args[1]));
        }

        if (args[0].equals("-b")) {
            System.out.println(bagOfWordsVector(args[1]));
        }

        if (args[0].equals("-v")) {
            System.out.println(bagOfWordsVectors(args[1], args[2]));
        }

        if (args[0].equals("-d")) {
            System.out.println(euclideanDistance(args[1], args[2]));
        }
    }

    private static int wordCount(String input) {
        String[] words = input.split("\\s");
        return words.length;
    }

    private static int charCount(String input) {
        return input.length();
    }

    private static int lineCount(String input) {
        String[] lines = input.split("\\n");
        return lines.length;
    }

    private static double lexicalDiversity(String input) {
        String[] words = input.split("\\s");
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        return (double) uniqueWords.size() / words.length;
    }

    private static String bagOfWordsVector(String input) {
        String[] words = input.toLowerCase().split("\\s");

        // create set of unique words
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        // create bag of words vector
        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : uniqueWords) {
            wordCount.put(word, 0);
        }
        for (String word : words) {
            wordCount.put(word, wordCount.get(word) + 1);
        }

        // create and return the bag of words vector as a string
        StringBuilder sb = new StringBuilder("[");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            sb.append(entry.getValue()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()).append("]");
        return sb.toString();
    }

    private static String bagOfWordsVectors(String input1, String input2) {
        String[] words1 = input1.toLowerCase().split("\\s");
        String[] words2 = input2.toLowerCase().split("\\s");

        // create set of unique words
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words1) {
            uniqueWords.add(word);
        }
        for (String word : words2) {
            uniqueWords.add(word);
        }

        // create bag of words vectors
        Map<String, Integer> wordCount1 = new TreeMap<>();
        Map<String, Integer> wordCount2 = new TreeMap<>();
        for (String word : uniqueWords) {
            wordCount1.put(word, 0);
            wordCount2.put(word, 0);
        }
        for (String word : words1) {
            wordCount1.put(word, wordCount1.get(word) + 1);
        }
        for (String word : words2) {
            wordCount2.put(word, wordCount2.get(word) + 1);
        }

        // create and return the bag of words vectors as a string
        StringBuilder sb1 = new StringBuilder("[");
        StringBuilder sb2 = new StringBuilder("[");
        for (Map.Entry<String, Integer> entry : wordCount1.entrySet()) {
            sb1.append(entry.getValue()).append(", ");
        }
        for (Map.Entry<String, Integer> entry : wordCount2.entrySet()) {
            sb2.append(entry.getValue()).append(", ");
        }
        sb1.delete(sb1.length() - 2, sb1.length()).append("]");
        sb2.delete(sb2.length() - 2, sb2.length()).append("]");
        return sb1.toString() + "\n" + sb2.toString();
    }

    private static double euclideanDistance(String input1, String input2) {
        String[] words1 = input1.toLowerCase().split("\\s");
        String[] words2 = input2.toLowerCase().split("\\s");

        // create set of unique words
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words1) {
            uniqueWords.add(word);
        }
        for (String word : words2) {
            uniqueWords.add(word);
        }

        // create bag of words vectors
        Map<String, Integer> wordCount1 = new TreeMap<>();
        Map<String, Integer> wordCount2 = new TreeMap<>();
        for (String word : uniqueWords) {
            wordCount1.put(word, 0);
            wordCount2.put(word, 0);
        }
        for (String word : words1) {
            wordCount1.put(word, wordCount1.get(word) + 1);
        }
        for (String word : words2) {
            wordCount2.put(word, wordCount2.get(word) + 1);
        }

        // calculate the Euclidean distance between the bag of words vectors
        double distance = 0.0;
        for (Map.Entry<String, Integer> entry : wordCount1.entrySet()) {
            double diff = entry.getValue() - wordCount2.get(entry.getKey());
            distance += diff * diff;
        }
        return Math.sqrt(distance);
    }
}
