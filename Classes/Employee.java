package ClassesDemo;
/*Write a Java program to create a class named Employee with the following:
Data members: name, id, and salary.
Methods: 
A method work() that prints "<employee name> is working".
A method getSalary() that returns the salary.
A method setDetails() to show how to set values through a method

In the main() method:

Create two Employee objects.
Assign values to their data members (name, id, and salary).
Call the work() method for each employee.
Print their salary using getSalary(). 

To show the 1st two ways of initializing the data members
*/


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

void SetDetails(String name,int id,double salary){   // A method written to show how to initialize value through method
 this.name=name;
 this.id=id;
 this.salary=salary;
 
}

 public static void main(String[] args) {
    //obj 1
    Employee e=new Employee();  // assign values to the instance variables using a reference variable
    e.name="Alice";
    e.id=101;
    e.salary=40000;
    e.work();
    System.out.println(e.getSalary());

   // obj 2
   Employee e1=new Employee(); // 
   e1.SetDetails("Dan", 103, 250);  // initilaized using the method setDetails.
   System.out.println(e1.getSalary());
    e1.work();
    System.out.println(e1.getSalary());

        
 }
}

