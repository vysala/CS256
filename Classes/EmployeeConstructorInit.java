
/* Modified the employee class to add a display method that displays all the datamembers and removed the 
 * getSalary() method
 * Program to show default and parameterized constructor
 */

package ClassesDemo;

class Employee1 {
// instance variables 
String name;
int id;
double salary;

//instance methods 
void work(){
    System.out.println(name + " is working");
}

void display(){
    System.out.println("Name= " + name + " id = " +id + " salary= " +salary);
}

public Employee1() {  // default constructor 
}

public Employee1(String name) {   //  constructor with default value assigned for id and salary
    this.name=name;
    this.id=0;
    this.salary=0.0;
}


public Employee1(String name, int id, double salary) {   // parameterized constructor
    this.name = name;  
    this.id = id;
    this.salary = salary;
}



//setter methods
public void setName(String name) {
    this.name = name;
}

public void setId(int id) {
    this.id = id;
}


public void setSalary(double salary) {
    this.salary = salary;
}

//getter methods
public String getName() {
    return name;
}

public int getId() {
    return id;
}

public double getSalary() {
    return salary;
 }
}

public class EmployeeConstructorInit {

 public static void main(String[] args) {
    //obj 1
    Employee1 e=new Employee1("Bob",101,25499);
    System.out.println(e.getSalary());
    e.display();
   
    //obj2
    Employee1 e1=new Employee1("Alice");
    e1.display();

    //obj3
    Employee1 e2=new Employee1(null);
    e2.display();
    
    
 }
}


