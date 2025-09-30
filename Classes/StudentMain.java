package ClassesDemo;

// Used the Student class blueprint created inside the StudentBP class to create student object in this class
public class StudentMain {
public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Alice";
       s1.age = 20;

       Student s2 = new Student();
       s2.name = "Bob";
       s2.age = 22;

        // Each object has its own data
        s1.display();   // Alice is 20 years old.
        s2.display();   // Bob is 22 years old.
    
    Student s5=new Student();
    s5.display();

    Student s6=new Student("Kevin",50);
    s6.display();

}
}
  
