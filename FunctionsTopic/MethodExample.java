package FunctionsTopic;

public class MethodExample {

    // Value-returning method: returns the square of a number
    public static int square(int number) {
        return number * number;   // returns a value
    }

    // Void method: just prints the square of a number, no return
    public static void printSquare(int number) {
        int result = number * number;
        System.out.println("The square of " + number + " is " + result);
    }

    public static void main(String[] args) {
        // Using the value-returning method
        int num = 5;
        int squared = square(num);  // stores the result in a variable
        System.out.println("Returned square: " + squared);

        // Using the void method
        printSquare(num);  // directly prints, no return value
    }
}
