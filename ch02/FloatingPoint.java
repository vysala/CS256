/* This program introduces floating-point numbers in Java. Floating-point data types such as double are used when we 
    need to store numbers that contain a decimal part, such as 3.14, 123.45, or 0.5.

    */

public class FloatingPoint {

    public static void main(String[] args) {
        //Declares and initializes a double variable pi.

        double pi;
        pi = 3.14159;

        //Calculates and prints the fraction of an hour that 59 minutes represents.
        double minute3 = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute3 / 60.0);

        //Assigns a fraction to a double to demonstrate floating-point precision.

        double y = 1.0 / 3.0;  // correct

        //Shows how floating-point arithmetic can produce rounding errors (important concept!).
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        //Demonstrates a safer way to store balance using integers (in cents) instead of floating-point types like double.
        double balance = 123.45;  // potential rounding error
        int balance2 = 12345;     // total number of cents; this will work as lomg as the number of cents doesn't exceed the largest int.
    }

}
