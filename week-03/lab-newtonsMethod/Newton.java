public class Newton {
    public static void main(String[] args) {
        try {
            System.out.println(sqRoot(args));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double sqRoot(String[] args) {

        // Nasty exception
        if (args.length < 2 || args.length > 3) {
            throw new IllegalArgumentException("Incorrect Number of Parameters\nUsage: java Newton number guess epsilon");
        }

        // Read in values
        double n = Double.parseDouble(args[0]);
        double guess = Double.parseDouble(args[1]);
        double x = guess;
        double error = (args.length == 3) ? Double.parseDouble(args[2]) : 0.0000001;

        while (Math.abs((n / x + x) / 2.0 - x) >= error) {
            x = (n / x + x) / 2.0;
        }

        return (n / x + x) / 2.0;
    }
}
