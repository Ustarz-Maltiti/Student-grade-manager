import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("=== Student Grade Manager ===");
        System.out.print("How many students? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            students.add(new Student(name, grade));
        }

        System.out.println("\n--- Results ---");
        double total = 0;
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGrade() + " (" + s.getLetterGrade() + ")");
            total += s.getGrade();
        }
        System.out.println("Average Grade: " + (total / students.size()));
    }
}