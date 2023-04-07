/**
 * This class performs a test on the Student class by instantiating a Student, then getting their details.
 */
public class Tester {
    public static void main (String[] args) {
        Student alice = new Student("Alice", "aliceXtreme@aol.com", 1984, 2021, 1234567);
        System.out.println(alice.name);
    }
}
