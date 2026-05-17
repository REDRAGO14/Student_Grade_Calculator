public class GradeReport {

        University uni = new University();
        public void printReport(Student student) {

            System.out.println("\n===== REPORT =====");
            uni.display();
            System.out.println("Student: " + student.getName());
            System.out.println("Grade: " + student.CalculateGrade());
            student.showRules();
        }
}

