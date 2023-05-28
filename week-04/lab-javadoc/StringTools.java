/**
 * A bunch of utility functions for Strings.
 *
 * @author Not me, I wrote the Javadoc parts ;)
 * @version 1.0
 */
public class StringTools {

  /**
   * Computes the length of a string.
   * <p>
   * This is done by first turning it into an Array of characters, then
   * iteratively incrementing an integer variable for every character.
   * This is of course are really silly solution because String.length or Array.size can be used instead.
   * In fact, the latter is implicitly used in the termination criterion of the for loop.
   * </p>
   * @param  str the string to consider
   * @return the length of the given string.
   */
  public static int length(String str){
    char[] len= str.toCharArray();
    int a=0;
    for(char ch : len) {
      a++;
    }
    return a;
  }

  /**
   * Reverses the order of characters in the input string.
   * <p>
   * This method takes a string as input and returns a new string with the characters in the reverse order.
   * It does this by iterating over the characters of the input string from the end and building a new string
   * with the characters in reverse order.
   * </p>
   * @param s the input string to be reversed
   * @return a new string with the characters in the reverse order of the input string
   */
  public static String swap(String s){
    String rev="";

    for(int j=s.length();j>0;--j){
      rev=rev+(s.charAt(j-1));
    }
    return rev;
  }

  /**
   * The main method of the program.
   * <p>
   * This method prompts the user to enter a string, and then computes and prints the length of the string
   * and its reverse using the `length` and `swap` methods respectively. The input string is obtained using
   * the `Comp122.getString` method.
   * </p>
   * @param arg the command-line arguments for the program (not used)
   */
  public static void main(String[] arg)
  {
    String str=Comp122.getString("Enter a string: ");
    System.out.println("It's length is " + length(str));
    System.out.println("It's swap is " + swap(str));
  }
}
