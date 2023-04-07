public class StringApp {

    // Part 1
    public static String pow(String s, int n) {
        // your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        } return sb.toString();  // the n-fold concatenation of s
    }


    // Part 2
    public static int factorCount(String a, String f){
        // your code here
        int count = 0;
        for (int i = 0; i <= a.length() - f.length(); i++) {
            count += a.substring(i, i + f.length()).equals(f) ? 1 : 0;
        } return count;
    }

    public static int factorCount(String a, String f, boolean caseSensitive){
        // your code here
        int count = 0; int fl = f.length();
        for (int i = 0; i <= a.length() - fl; i++) {
            if (a.regionMatches(!caseSensitive, i, f, 0, fl)) {
                count++;
            }
        } return count;
    }


    // Part 3
    public static void main(String[] args) {
        String input = args[0];

        for (char letter = 'a'; letter <= 'z'; letter++) {  // why does this work?
           // replace the next line. Can you explain what + means here and why?
           int count = factorCount(input, Character.toString(letter), false);
           System.out.println(letter + ": " + count);
        }

    }

}
