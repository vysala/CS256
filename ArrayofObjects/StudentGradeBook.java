package ArraysOfObjects;


import java.util.Scanner;

class Stud {
    int id;
    String name;
    double score;

    // Constructor
    Stud(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Display method
    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score);
    }
}

public class StudentGradeBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Create an array of Student objects
        Stud[] students = new Stud[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Score: ");
            double score = sc.nextDouble();

            // Create student object and store in array
            students[i] = new Stud(id, name, score);
        }

        // Compute total, highest, and lowest
        double total = 0, highest = students[0].score, lowest = students[0].score;

         // write your code here  // lab exercise question : Compute total, highest and lowest using enhanced for loop 

           

        // Finding average
        double average = total / n;

        // Display results
        System.out.println("\n===== GradeBook Summary =====");
        for (Stud s : students) {
            s.displayInfo();
        }

        System.out.println("\nClass Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score : " + lowest);

        sc.close();
    }
}

