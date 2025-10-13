package InheritDemo;

// Parent class
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Engine is now running..");
    }
}

// Child class
class Car extends Vehicle {
    String model = "camry";

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        // Case 1: Parent reference → Parent object
        System.out.println("---Using Vehicle Object------");
        Vehicle v = new Vehicle();
        System.out.println(v.brand);
        v.start(); 

        // Case 2: Child reference → Child object
        System.out.println("---- Using Car Object ----");
        Car c = new Car();
        System.out.println(c.brand);
        c.start();

       // System.out.println(c.model);
       // c.display(); */
        

        // Case 3: Parent reference → Child object (Upcasting)

        Vehicle var = new Car();   // Allowed: Parent reference can hold Child object. only parent's variables and functions  will be accessible
        System.out.println(var.brand);
        var.start(); 
        
        // The following are not accessible through the parent reference:
        //System.out.println(var.model);
        // var.display();
        

        // Case 4: Child reference → Parent object (Downcasting required as child classs cannot hold parent class object)
        // This compiles, but fails at runtime with ClassCastException. throws rumtime exception
        
       // Car ca = (Car)new Vehicle();   
        
        // Parent object cannot be cast to Child
        // java.lang.ClassCastException will occur here

        //System.out.println(ca.model); 
        //ca.display();
     
    }
}

