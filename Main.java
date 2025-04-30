import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize Teachers
        Teacher teacher1 = new Teacher("T01", "Alice", "Early Childhood Educator");
        Teacher teacher2 = new Teacher("T02", "Bob", "Assistant");

        // Initialize Nursery Classes
        NurseryClass babyClass = new BabyClass();
        NurseryClass middleClass = new MiddleClass();
        NurseryClass topClass = new TopClass();

        // Assign Teachers
        babyClass.assignedTeacher = teacher1;
        middleClass.assignedTeacher = teacher2;
        topClass.assignedTeacher = teacher2;

        boolean continueEnrollment = true;
        while (continueEnrollment) {
            // Prompt user to choose class
            System.out.println("Choose a class to enroll the student:");
            System.out.println("1. Baby Class (2-3 years, Max 15 students, Early Childhood Educator required)");
            System.out.println("2. Middle Class (3-4 years, Max 20 students)");
            System.out.println("3. Top Class (4-5 years, Max 25 students, Assessments required)");

            int classChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Ask for student details
            System.out.println("Enter student ID:");
            String studentId = scanner.nextLine();
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter student age:");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter guardian name:");
            String guardianName = scanner.nextLine();

            Student student = new Student(studentId, studentName, age, guardianName);

            boolean enrolled = false;
            switch (classChoice) {
                case 1: // Baby Class
                    if (age >= 2 && age <= 3) {
                        enrolled = babyClass.enrollStudent(student);
                    } else {
                        System.out.println("Student age does not match Baby Class age range.");
                    }
                    break;
                case 2: // Middle Class
                    if (age >= 3 && age <= 4) {
                        enrolled = middleClass.enrollStudent(student);
                    } else {
                        System.out.println("Student age does not match Middle Class age range.");
                    }
                    break;
                case 3: // Top Class
                    if (age >= 4 && age <= 5) {
                        enrolled = topClass.enrollStudent(student);
                    } else {
                        System.out.println("Student age does not match Top Class age range.");
                    }
                    break;
                default:
                    System.out.println("Invalid class choice.");
                    break;
            }

            if (enrolled) {
                System.out.println("Student " + studentName + " enrolled successfully.");
            } else {
                System.out.println("Enrollment failed for student " + studentName + ".");
            }

            // Ask if the user wants to enroll another student
            System.out.println("Do you want to enroll another student? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                continueEnrollment = false;
            }
        }

        // Conduct activities
        System.out.println("Enter the activity to conduct:");
        String activity = scanner.nextLine();
        babyClass.conductActivity(activity);
        middleClass.conductActivity(activity);
        topClass.conductActivity(activity);

        // Generate Reports
        babyClass.generateClassReport();
        middleClass.generateClassReport();
        topClass.generateClassReport();
    }
}
