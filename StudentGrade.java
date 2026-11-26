import java.util.Scanner;

class Student {
    String name;
    int mark1, mark2, mark3;

    // Constructor
    Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Calculate total marks
    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Subject 1 Marks: " + mark1);
        System.out.println("Subject 2 Marks: " + mark2);
        System.out.println("Subject 3 Marks: " + mark3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("---------------------------");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Accept student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter three subject marks: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            students[i] = new Student(name, m1, m2, m3);
        }

        // Display student details
        System.out.println("\nSTUDENT ACADEMIC DETAILS");

        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }

        sc.close();
    }
}
