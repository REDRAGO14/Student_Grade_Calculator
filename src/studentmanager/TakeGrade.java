import java.util.Scanner;
import java.util.InputMismatchException;

public class TakeGrade {
        Scanner scanner = new Scanner(System.in);
        double mark = 0;
        String name = "";
        public Student getStudent() {
            try {
                System.out.println("Enter name: ");
                name = scanner.next();
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid name");
                scanner.next();
            }
            try {
                System.out.print("Enter mark: ");
                mark = scanner.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid mark input!");
                scanner.next();
            }
            System.out.print("Type (1 = Regular, 2 = Extension): ");
            int type = scanner.nextInt();

            if (type == 2) {
                return new ExtensionStudent(name, mark);
            } else {
                return new RegularStudent(name, mark);
            }
        }
}
