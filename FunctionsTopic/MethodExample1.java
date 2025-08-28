package FunctionsTopic;

public class MethodExample1 {

    // Void method: demonstrates arithmetic operators
    public static void arithmeticOperations(int a, int b) {
        System.out.println("Arithmetic Operations with a = " + a + ", b = " + b);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }

    // Void method: demonstrates relational operators
    public static void relationalOperations(int a, int b) {
        System.out.println("\nRelational Operations:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }

    // Void method: demonstrates logical operators
    public static void logicalOperations(boolean x, boolean y) {
        System.out.println("\nLogical Operations with x = " + x + ", y = " + y);
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));
    }

    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean x = true, y = false;

        // Call methods
        arithmeticOperations(a, b);
        relationalOperations(a, b);
        logicalOperations(x, y);
    }
}
