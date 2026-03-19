import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int roll;
    String grade;

    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Grade: " + grade);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); // clear buffer

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();

                sc.nextLine(); // clear buffer
                System.out.print("Enter grade: ");
                String grade = sc.nextLine();

                students.add(new Student(name, roll, grade));

            } else if (choice == 2) {
                for (Student s : students) {
                    s.display();
                }

            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}