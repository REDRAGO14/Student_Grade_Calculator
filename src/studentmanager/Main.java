import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TakeGrade tg = new TakeGrade();
        GradeReport report = new GradeReport();

        // This list will store all Regular and Extension students
        List<Student> studentList = new ArrayList<>();

        while (true) {
            // Add a student to the list
            studentList.add(tg.getStudent());

            System.out.print("Add another student? (y/n): ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Generate reports for everyone at once
        System.out.println("\n--- GENERATING ALL REPORTS ---");
        for (Student s : studentList) {
            report.printReport(s);
        }
    }
}