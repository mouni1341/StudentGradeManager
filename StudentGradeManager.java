import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Grade: ");
            double grade = sc.nextDouble();

            names.add(name);
            grades.add(grade);
        }

        // Calculate average, highest and lowest
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / n;

        // Display summary report
        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student: " + names.get(i) +
                " | Grade: " + grades.get(i)
            );
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Average Grade : %.2f%n", average);
        System.out.printf("Highest Grade : %.2f%n", highest);
        System.out.printf("Lowest Grade  : %.2f%n", lowest);
        System.out.println("===========================================");

        sc.close();
    }
}