public class LeapYear {
    public static void main(String[] args) {
        // get input
        int year = Comp122.getInt("Please enter a year");

        boolean leapYear = true;  // Your code here
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
		leapYear = false;
	}
	    // output
        System.out.println(leapYear);
    }
}
