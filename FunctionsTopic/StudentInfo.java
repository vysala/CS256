package FunctionsTopic;

public class StudentInfo {
// Void method: displays student details
    public static void displayStudent(String name, int age, String major) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }

    public static void main(String[] args) {
        displayStudent("Alice", 20, "Computer Science");
    }
}
