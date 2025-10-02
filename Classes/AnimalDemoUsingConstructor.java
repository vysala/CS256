package ClassesDemo;

// Class definition
class AnimalType{
    // Attributes (fields / properties)
    String breed;
    int size;
    int age;
    String color;

    // Constructor to set values when object is created
    AnimalType(String breed, int size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    // Method (behavior)
    void eat() {
        System.out.println(breed + " is eating...");
    }

        // Method to display details of the object
    void displayInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size + " cm");
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
        System.out.println("----------------------");
    }
}

public class AnimalDemoUsingConstructor {
    public static void main(String[] args) {
        // Object 1 created using constructor
        AnimalType dog1 = new AnimalType("Labrador", 80, 2, "Black");
        dog1.eat();         // calling method
        dog1.displayInfo(); // show details

        // Object 2 created using constructor
        AnimalType dog2 = new AnimalType("Beagle", 50, 3, "Brown");
        dog2.displayInfo(); // show details
    }
}
