package Polymorphism;
/*Polymorphism means a single function, method, or object can take many forms.
compile-time (method) polymorphism, also called method overloading, where the same method name works with
different parameter types or counts. */
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }
    
       
    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b){
        return a+b;
    }

    double add(double a, int b){
        return a+b; 
    } 
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 integers: " + calc.add(5, 10));           // calls add(int, int)
        System.out.println("Add 3 integers: " + calc.add(5, 10, 15));      // calls add(int, int, int)
        System.out.println("Add 2 doubles: " + calc.add(5.5, 10.5));       // calls add(double, double)
    }
}
