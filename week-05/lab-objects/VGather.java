public class VGather {
    public static void main(String[] args) {
        int n = Comp122.getInt("How Many Students In Class?\n");
        Student[] studentArray = new Student[n];

        for (int i = 0; i < n; i++) {
            studentArray[i] = new Student();
            studentArray[i].updateGrade(Comp122.getInt("Enter a grade:\n"));
        }

        double average = 0;

        for (int i = 0; i < n; i++) {
            average += studentArray[i].grade;
        } average /= n;

        System.out.println((double) Math.round(average * 100) / 100);
    }
}
