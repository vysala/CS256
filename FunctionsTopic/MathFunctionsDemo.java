package FunctionsTopic;

public class MathFunctionsDemo {
    public static void main(String[] args) {
        double num1 = 9.0;
        double num2 = 2.0;
        double num3 = -4.5;

        // Square root
        System.out.println("Square root of " + num1 + " = " + Math.sqrt(num1));

        // Power
        System.out.println(num2 + " raised to the power of " + num1 + " = " + Math.pow(num2, num1));

        // Absolute value
        System.out.println("Absolute value of " + num3 + " = " + Math.abs(num3));

        // Ceiling
        System.out.println("Ceiling of " + num3 + " = " + Math.ceil(num3));

        // Floor
        System.out.println("Floor of " + num3 + " = " + Math.floor(num3));

        // Round
        System.out.println("Round of " + num3 + " = " + Math.round(num3));

        // Maximum
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));

        // Minimum
        System.out.println("Minimum of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));

        // Random number between 0.0 and 1.0
        System.out.println("Random number between 0.0 and 1.0 = " + Math.random());
    }
}
