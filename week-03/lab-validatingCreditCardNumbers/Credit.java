public class Credit {
  public static void main(String[] args) {
    // This reads some number from the terminal.
    // Don't worry about this for now and just use the variable
    long number = Comp122.getLong("Number: ");

    // do stuff here with the number
    System.out.println(checksum(number) ? getCardType(number) : "INVALID");
  }

  /**
   * This method returns true iff number satisfies Luhn's Algorithm
   */
  public static boolean checksum(long number) {
    // Luhn's Algorithm is used to determine whether a given credit card number is valid. The algorithm works as follows:
    // 1. Starting from the rightmost digit, double the value of every second digit. If the result is a two-digit number, add the digits together.
    // 2. Add up all the resulting digits (including the ones that weren't doubled).
    // 3. If the total sum ends in 0 (i.e., is congruent to 10 modulo 10), the credit card number is valid.

    // Here are a few card numbers that PayPal recommends for testing https://www.paypalobjects.com/en_GB/vhelp/paypalmanager_help/credit_card_numbers.htm

    int checksumSum = 0;
    for (int i = numDigits(number) - 2; i >= 0; i -= 2) {
      int digit = getDigit(number, i);
      int product = digit * 2;
      // Add the sum of the digits in the product of the multiplication
      checksumSum += (product / 10) + (product % 10);
      // Add the sum of the digits not multiplied by 2
      checksumSum += getDigit(number, i + 1);
    } if (numDigits(number) % 2 == 1) {checksumSum += getDigit(number, 0);}
    // Check if the total sum ends with 0 (i.e. is congruent to 10)
    return checksumSum % 10 == 0;
  }

  /**
   * This method returns the number of digits in a given number
   */
  public static int numDigits(long number) {
    // The number is truncated when casting to an int
    return number == 0 ? 1 : (int) Math.log10(number) + 1;
  }

  /**
   * This method returns the digit at a given index in a number
   */
  public static int getDigit(long number, int index) {
    // Convert the number to a string
    // Get the character at the given index
    // Convert the character to an int
    return Character.getNumericValue(Long.toString(number).charAt(index));
  }

  /**
   * This method takes a card number and returns the type of card: AMEX, MASTERCARD, VISA or INVALID.
   */
  public static String getCardType(long number) {
    int numDigits = numDigits(number);
    // Extract the first two digits of the card number
    int prefix = (int) (number / Math.pow(10, numDigits - 2));

    // Check if the prefix and number of digits match any known card type and return the corresponding string
    // - All American Express numbers start with 34 or 37
    // - American Express uses 15-digit numbers
    if (numDigits == 15 && (prefix == 34 || prefix == 37)) {
        return "AMEX";
    // - Most MasterCard numbers start with 51, 52, 53, 54, or 55
    // - MasterCard uses 16-digit numbers
    } else if (numDigits == 16 && (prefix >= 51 && prefix <= 55)) {
        return "MASTERCARD";
    // - All Visa numbers start with 4
    // - Visa uses 13- and 16-digit numbers
    } else if ((numDigits == 13 || numDigits == 16) && prefix / 10 == 4) {
        return "VISA";
    } else {
        return "INVALID";
    }
  }
}