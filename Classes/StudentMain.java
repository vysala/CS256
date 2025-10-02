package ClassesDemo;

public class StudentMain {

public static void main(String[] args) {
    
    Student s=new Student();
    //1st method

    s.name="Alice";
    s.age=60;
    s.display();

    //using default constructor
    Student s1=new Student();
    s1.display();

    //using parameterized constructor
    Student s3=new Student("Bob",50);
    s3.display();
    s3.setAge(40);
    s3.display();


}

}

