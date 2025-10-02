package ClassesDemo;


public class InitializingStudentObject {
public static void main(String[] args) {

    // method 1 using reference variable
    Student s1=new Student();
    System.out.println("Initialized using reference variable");
    s1.name="Alice";
    s1.age=10;
   
    s1.display();

   // method 2 : setDetails() method that was created to initialize the variables 
   Student s2=new Student();
   s2.setDetails("Bob" ,18);
   System.out.println("Initialized using setDetails method");
   s2.display();
  
   // method 3: initializing using default constructor
   Student s3=new Student();
   System.out.println("Initialized using default constructor");
   s3.display();
  
   //method 4: initializing using parameterized constructor
   Student s4=new Student("Sam",40);
   System.out.println("Initialized using parameterized constructor");
   s4.display();

  // method 4: initliazing (or can update) value through setter methods ( encapsulation concept , normally used when data members are set private )
  Student s5= new Student();
  System.out.println("Initialized using setter methods");
  s5.setName("John");
  s5.setAge(15);
  s5.display();
    
}
}
