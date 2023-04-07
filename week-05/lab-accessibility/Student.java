public class Student {
    private boolean hasSubmitted = false;
    private String name;
    private String email;
    private int yearOfBirth;
    private int enrolmentYear;
    private int studentId;
    private int grade = 0;

    // Setters
    public void updateGrade(int mark) {
        if (mark < 0 || mark > 100) {
            System.out.println("Enter a grade from 0-100.");
            return;
        } else {
            grade += mark;
            hasSubmitted = true;
        }
    }

    public void submitCoursework() {
        hasSubmitted = true;
    }

    // Getters
    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public int getStudentId() {
        return studentId;
    }

    // Constructors
    public Student() {

    }

    public Student (String studentName, String studentEmail, int studentYearOfBirth, int studentEnrolmentYear, int studentStudentId) {
        name = studentName;
        email = studentEmail;
        yearOfBirth = studentYearOfBirth;
        enrolmentYear = studentEnrolmentYear;
        studentId = studentStudentId;
    }

    // When we define multiple methods with the same method name, but different arguments this is called overloading a method.
    public Student (String studentName, String studentEmail, int studentYearOfBirth) {
        name = studentName;
        email = studentEmail;
        yearOfBirth = studentYearOfBirth;
    }

    public Student (String studentName, String studentEmail, String studentYearOfBirth) {
        name = studentName;
        email = studentEmail;
        yearOfBirth = Integer.parseInt(studentYearOfBirth.split("/")[studentYearOfBirth.split("/").length - 1]);
    }
}
