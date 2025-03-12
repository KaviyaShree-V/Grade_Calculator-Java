import java.util.*;

public class GradeCalculator {
    static Scanner scanner = new Scanner(System.in);

    static void start() {
        System.out.println("Student Grade Calculator");
        System.out.println("Calculate Percentage & Find Grade");
        System.out.println("1. Yes \n2. No");
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 1) {
            System.out.println("Welcome to Grade Calculator");
            getMarks();
        } else if (n == 2) {
            System.out.println("Thank you ! Visit again");
            System.exit(2);
        } else {
            System.out.println(" Calculate your grades.....");
        }
    }

    public static void getMarks() {
        System.out.println("Enter the number of Subjects :");
        int marks = Integer.parseInt(scanner.nextLine());
        int[] m = new int[marks];
        int total = 0, i;
        String grade = " ";
        float percent;
        for (i = 0; i < marks; i++) {
            m[i] = scanner.nextInt();
            total += m[i];
        }
        percent = (float) total / marks;
        for (i = 0; i < marks; i++) {
            if (m[i] < 35) {
                grade = "Fail";
                System.out.println("\t\t\t Result \t\t\t");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\n\t\t\t  Percentage: "+percent);
                System.out.println("\t\t\t  Grade: " +grade);
                return;
            }
        }
        if (percent >= 80) {
            grade = "O";
        } else if (percent >= 70 && percent < 80) {
            grade = "A";
        } else if (percent > 60 && percent < 70) {
            grade = "B";
        } else if (percent > 45 && percent <= 60) {
            grade = "C";
        } else if (percent >= 35 && percent <= 50) {
            grade = "D";
        }
        System.out.println("\t\t\t Result: \t\t\t");
        System.out.println("Percentage:"+percent);
        System.out.println("Grade:" +grade);
    }
}