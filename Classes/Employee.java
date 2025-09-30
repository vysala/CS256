package ClassesDemo;
/*Write a Java program to create a class named Employee with the following:

Data members: name, id, and salary.
A method work() that prints "<employee name> is working".
A method getSalary() that returns the salary.

In the main() method:

Create two Employee objects.
Assign values to their data members (name, id, and salary).
Call the work() method for each employee.
Print their salary using getSalary(). */


public class Employee{
String name;
int id;
double salary;

void work(){
    System.out.println(name + " is working");
}

public double getSalary() {
    return salary;
 }

 public static void main(String[] args) {
    //obj 1
    Employee e=new Employee();
    e.name="Alice";
    e.id=101;
    e.salary=40000;
    e.work();
    System.out.println(e.getSalary());

   // obj 2
   Employee e1=new Employee();
    e1.name="Bob";
    e1.id=102;
    e1.salary=50000;

    e1.work();
    System.out.println(e1.getSalary());

    


    
 }
}

