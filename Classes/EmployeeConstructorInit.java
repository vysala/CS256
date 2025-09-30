package ClassesDemo;

class Employee {

String name;
int id;
double salary;

void work(){
    System.out.println(name + " is working");
}



public Employee() {
    this.name="Unknow";
    this.id=0;
    this.salary=0;
}



public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
}



public void setName(String name) {
    this.name = name;
}



public void setId(int id) {
    this.id = id;
}



public void setSalary(double salary) {
    this.salary = salary;
}



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
    Employee e=new Employee();
    System.out.println(e.getSalary());
    
    
 }
}

