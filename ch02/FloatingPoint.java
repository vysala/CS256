/* This program introduces floating-point numbers in Java. Floating-point data types such as double are used when we 
    need to store numbers that contain a decimal part, such as 3.14, 123.45, or 0.5.

    */

public class FloatingPoint {

    public static void main(String[] args) {
        //Declares and initializes a double variable pi.

        double pi;
        pi = 3.14159;

        //Calculates and prints the fraction of an hour that 59 minutes represents. The .0 tells Java that these are floating-point values.
        double minute3 = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute3 / 60.0);   // gives 0.983333333333

        //Try running this line to see the difference in output, System.out.println(59 / 60);  because both values are integers, so Java performs integer division.
        //Assigns a fraction to a double to demonstrate floating-point precision.

        double y = 1.0 / 3.0;  // 1 ÷ 3 = 0.333333333333...  The decimal goes on forever. A computer, however, has a limited amount of space to store a number, so it stores an approximation.

        //Shows how floating-point arithmetic can produce rounding errors (important concept!).
        System.out.println(0.1 * 10);  // you expect 1.0
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        /*  Computers store numbers using bits (0s and 1s). Some decimal numbers, such as 0.1, cannot be represented exactly in binary. So Java stores a very close approximation. 
        When we add that approximation many times, the tiny difference can become visible. */
        //Demonstrates a safer way to store balance using integers (in cents) instead of floating-point types like double.
        double balance = 123.45;  // potential rounding error
        int balance2 = 12345;     // total number of cents; this will work as lomg as the number of cents doesn't exceed the largest int.
   
     /* double is used to store numbers with decimal values. It is useful for calculations involving fractions and measurements, but remember that floating-point numbers are sometimes approximations, not exact values. This is especially important when working with money
         or other situations where exact precision matters. */
    }

}
