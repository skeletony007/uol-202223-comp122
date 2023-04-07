public class Student {
    public boolean hasSubmitted = false;
    public String name;
    public String email;
    public int yearOfBirth;
    public int enrolmentYear;
    public int studentId;
    public int grade = 0;

    public void updateGrade(int mark) {
        grade += mark;
    }

    public void submitCoursework() {
        hasSubmitted = true;
    }

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
