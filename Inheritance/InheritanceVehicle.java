
package InhertianceTopic;
/**
 * Write a Java program to create a class called Vehicle with a method called drive(). 
 * Create a subclass called Car that overrides the drive() method to print "Repairing a car".
 */

// Define the parent class Vehicle
class Vehicle {
    // Define a public method named drive
    public void drive() {
        // Print "Repairing a vehicle" to the console
        System.out.println("Repairing a vehicle");
    }
} 

 // Define the child class Car that extends Vehicle
class Car extends Vehicle {
    // Use the @Override annotation to indicate that this method overrides a method in the superclass
    @Override   // annotation : gives the compiler instructions about the code
    // Define the drive method
    public void drive() {
        // Print "Repairing a car" to the console
        System.out.println("Repairing a car");
    }
} 

// Define the main class
public class InheritanceVehicle {
    // Define the main method
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        // Create an instance of Car
        Car car = new Car();
        // Call the drive method on the vehicle instance
        vehicle.drive(); // Output: Repairing a vehicle
        // Call the drive method on the car instance
        car.drive(); // Output: Repairing a car
    }
} 


