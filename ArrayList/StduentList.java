package ArrayListPgms;
import java.util.ArrayList;
class Student {
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // toString() method for easy display
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}


public class StduentList {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding student objects
        studentList.add(new Student("Alice", 20, 88.5));
        studentList.add(new Student("Bob", 21, 92.3));
        studentList.add(new Student("Charles", 19, 79.8));
        studentList.add(new Student("Diana", 22, 85.0));

        // Display all students
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}


