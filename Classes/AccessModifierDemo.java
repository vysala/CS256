package ClassesDemo;

 class StudentAM {
    // public variable
    public String name = "Alice";

    // private variable
    private int age = 20;

    // public method
    public void showName() {
        System.out.println("Name: " + name);
    }

    // private method
    private void showAge() {
        System.out.println("Age: " + age);
    }

    // use getter method to access the private datamember age

    public int getAge() {
        return this.age;
    }

    //setter method to set the age field
    public void setAge(int age) {
        this.age = age;
    }

    
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        StudentAM s = new StudentAM();

        //  Can access public field and method
        System.out.println("Accessing public variable: " + s.name);
        s.showName();

        // Cannot access private field/method directly (uncommenting gives error)
       //  System.out.println(s.age);       // ERROR
       // s.showAge();                     // ERROR

       // using getter method to get Age
       System.out.println("Age:" + s.getAge());
       
       //2nd object created, name set to 'Bob' using refernce variable.  Age set using setAge() method.
       StudentAM s1 = new StudentAM();
       s1.name="Bob";
       s1.setAge(15);
       s1.showName();
       s1.getAge();
       System.out.println("Age:" + s1.getAge());
    }
}
