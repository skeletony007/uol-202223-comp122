public class Largest {
    public static void main(String[] args) {
        int n = Comp122.getInt("Length of Array:");

        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = Comp122.getInt("Enter an integer:");
        }

        int largestValue = -2147483648;

        for (int i = 0; i < n; i++) {
            if (myArray[i] > largestValue) {
                largestValue = myArray[i];
            }
        }

        System.out.println(largestValue);
    }
}
