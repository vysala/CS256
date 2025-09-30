package ClassesDemo;

class Student {
    String name;   // Data member
    int age;       // Data member

    void display() {  // Method to display values
        System.out.println(name + " is " + age + " years old."); }


     // user-written method to initialize values    
    void setDetails(String n,int a){
        this.name=n;
        this.age=a;

          }

 // using default constructor to initialize the values 
    public Student() {
        this.name="Unknown";
        this.age=0;

    }
//using paramterized constructor 

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // using setter method for name data member

    public void setName(String name) {
        this.name = name;
    }
// setter method for age data member
    public void setAge(int age) {
        this.age = age;
    }



     
    
}