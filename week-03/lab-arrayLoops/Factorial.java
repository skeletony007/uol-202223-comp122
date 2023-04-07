public class Factorial {
    public static void main(String[] args) {
        int n = Comp122.getInt("Enter an integer: ");
        long factorial = 1;

        for(int i = 2; i <= n; i++) {
                factorial *= i;
        }

        System.out.println(factorial);
    }
}