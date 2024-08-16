import java.util.Scanner;

class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }
}

class Student {
    int studentId;
    String name;
    Course[] registeredCourses;
    int numRegistered;

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new Course[10]; // Assuming a maximum of 10 courses per student
        this.numRegistered = 0;
    }

    void registerCourse(Course course) {
        if (numRegistered < 10) {
            registeredCourses[numRegistered++] = course;
            System.out.println("Course " + course.code + " registered successfully.");
        } else {
            System.out.println("Cannot register more than 10 courses.");
        }
    }
}

public class Sreg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Course course1 = new Course("CS101", "Introduction to Programming", "Learn Java basics", 50, "Mon/Wed 10:00 AM");
        Course course2 = new Course("MATH201", "Calculus I", "Limits, derivatives, and integrals", 40, "Tue/Thu 2:00 PM");

        
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentId, studentName);

        
        student.registerCourse(course1);
        student.registerCourse(course2);

        
        System.out.println("\n" + student.name + "'s registered courses:");
        for (int i = 0; i < student.numRegistered; i++) {
            System.out.println(student.registeredCourses[i].code + " - " + student.registeredCourses[i].title);
        }

        scanner.close();
    }
}
