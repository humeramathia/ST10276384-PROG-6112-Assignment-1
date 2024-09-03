
package St10276384_prog_poe_assignment1;
import java.util.ArrayList;
import java.util.Scanner;

//----------------------------------------------------------Start of code----------------------------//

// StudentManagement class
public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to launch the menu (unchanged)
    public void launchMenu() {
        String choice;
        do {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("******************************");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                showMenu();
            } else {
                System.out.println("Exiting the application...");
                break;
            }
        } while (true);
    }

    private void showMenu() {
        while (true) {
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit Application.");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    captureStudent();
                    break;
                case "2":
                    searchStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    printStudentReport();
                    break;
                case "5":
                    System.out.println("Exiting to main menu...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    // Method modified to accept parameters directly for testing
    public void captureStudent(String id, String name, int age, String email, String course) {
        if (age < 16) {
            throw new IllegalArgumentException("Student age must be 16 or older.");
        }

        students.add(new Student(id, name, age, email, course));
    }

    // Search student by ID for testing
    public Student searchStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Delete student by ID for testing
    public boolean deleteStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    // Method to generate a student report
    public String generateStudentReport() {
        StringBuilder report = new StringBuilder();

        int count = 1;
        for (Student student : students) {
            report.append("STUDENT ").append(count).append("\n");
            report.append("-----------------------------\n");
            report.append(student.toString()).append("\n");
            count++;
        }

        return report.toString();
    }

    // Original methods without parameters for user input (unchanged)
    private void captureStudent() {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************");

        System.out.print("Enter the student id: ");
        String id = scanner.nextLine();

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        int age = -1;
        while (age < 16) {
            try {
                System.out.print("Enter the student age: ");
                age = Integer.parseInt(scanner.nextLine());

                if (age < 16) {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.println("Please re-enter the student age >> ");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.println("Please re-enter the student age >> ");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, email, course));
        System.out.println("Student details have been successfully saved.");
    }

    private void searchStudent() {
        System.out.print("Enter the student id to search: ");
        String id = scanner.nextLine();

        Student student = searchStudentById(id);
        if (student != null) {
            System.out.println(student.toString());
        } else {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    private void deleteStudent() {
        System.out.print("Enter the student id to delete: ");
        String id = scanner.nextLine();

        boolean isDeleted = deleteStudentById(id);
        if (isDeleted) {
            System.out.println("Student with Student Id: " + id + " WAS deleted!");
        } else {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    private void printStudentReport() {
        String report = generateStudentReport();
        if (report.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println(report);
        }
    }
}
//----------------------------------End of code----------------------------//