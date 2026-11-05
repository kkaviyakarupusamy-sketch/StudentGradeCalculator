import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");
        System.out.println("Welcome to Student Grade Calculator!");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;
        boolean passed = true;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();

            total = total + marks[i];

            if (marks[i] < 35) {
                passed = false;
            }
        }

        double average = total / 5.0;

        System.out.println("\n===== Student Result =====");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (!passed) {
            System.out.println("Grade: F");
            System.out.println("Result: FAIL");
        } else if (average >= 90) {
            System.out.println("Grade: A");
            System.out.println("Result: PASS");
        } else if (average >= 75) {
            System.out.println("Grade: B");
            System.out.println("Result: PASS");
        } else if (average >= 50) {
            System.out.println("Grade: C");
            System.out.println("Result: PASS");
        } else {
            System.out.println("Grade: D");
            System.out.println("Result: PASS");
        }

        sc.close();
    }
}