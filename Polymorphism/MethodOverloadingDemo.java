package VRecord;

import FunctionsTopic.Calculator;

public class MethodOverloadingDemo {

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloadingDemo calc = new MethodOverloadingDemo();

        System.out.println("Sum of two integers: " 
                            + calc.add(10, 20));

        System.out.println("Sum of three integers: " 
                            + calc.add(10, 20, 30));

        System.out.println("Sum of two doubles: " 
                            + calc.add(5.5, 4.5));
    }
}
