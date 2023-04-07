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
}
