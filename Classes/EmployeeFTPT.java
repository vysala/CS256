package ClassesDemo;

class EmployeeFTPT {
    String name;
    String type; // "fulltime" or "parttime"
    double salary; // for full-time employees
    double hourlyRate; // for part-time employees
    int hoursWorked; // for part-time employees

    // Constructor for full-time employee
    EmployeeFTPT(String name, double salary) {
        this.name = name;
        this.type = "fulltime";
        this.salary = salary;
    }

    // Constructor for part-time employee
    EmployeeFTPT(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.type = "parttime";
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate salary
    double calculateSalary() {
        if (type.equals("fulltime")) {
            return salary;
        } else {
            return hourlyRate * hoursWorked;
        }
    }

    // Display employee details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee Type: " + type);
        System.out.println("Salary: $" + calculateSalary());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Full-time employee
        EmployeeFTPT e1 = new EmployeeFTPT("Alice", 5000);
        // Part-time employee
        EmployeeFTPT e2 = new EmployeeFTPT("Bob", 20, 80); // $20/hour, 80 hours

        e1.displayInfo();
        e2.displayInfo();
    }
}
